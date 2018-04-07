using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using APISeverMoneyWeb.Models;

namespace APISeverMoneyWeb.Controllers
{
    public class HomeController : ApiController
    {
        public QuanlythuchiEntities1 db = new QuanlythuchiEntities1();

        public IQueryable<money_dtb> GetMoney_Dtbs()
        {
            return db.money_dtb;
        }


        public money_dtb GetMoney(int id)
        {
            QuanlythuchiEntities1 db = new QuanlythuchiEntities1();

            return db.money_dtb.FirstOrDefault(x => x.id == id);
        }

        [HttpPost] // Thêm mới thông tin
        public bool InSertNewMoney(String name, DateTime date, String content, int amount, String note)
        {
            try
            {
                QuanlythuchiEntities1 db = new QuanlythuchiEntities1();
                money_dtb money = new money_dtb();
                money.name = name;
                money.date = date;
                money.content1 = content;
                money.amount = amount;
                money.note = note;

                return true;
            }
            catch
            {
                return false;
            }
        }


        [HttpPut] // chỉnh sửa thông tin
        public bool UpdateMoney(int id, String name, DateTime date, String content, int amount, String note)
        {
            try
            {
                QuanlythuchiEntities1 db = new QuanlythuchiEntities1();

                money_dtb money = db.money_dtb.FirstOrDefault(x => x.id == id); // lay money ton tai

                if (money == null)
                    return false;
                money.name = name;
                money.date = date;
                money.content1 = content;
                money.amount = amount;
                money.note = note;

                return true;
            }
            catch
            {
                return false;
            }
        }

        [HttpDelete] // xóa thông tin
        public bool DeleteMoney(int id)
        {
            QuanlythuchiEntities1 db = new QuanlythuchiEntities1();

            money_dtb money = db.money_dtb.FirstOrDefault(x => x.id == id);

            if (money == null)
                return false;

            return true;
        }

    }
}
