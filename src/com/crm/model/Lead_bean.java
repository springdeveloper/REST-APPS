package com.crm.model;

/*   1:    */
/*   2:    */ 
/*   3:    */ import javax.persistence.Column;
/*   4:    */ import javax.persistence.Entity;
/*   5:    */ import javax.persistence.GeneratedValue;
/*   6:    */ import javax.persistence.Id;
/*   7:    */ import javax.persistence.Table;
/*   8:    */ 
/*   9:    */ @Entity
/*  10:    */ @Table(name="lead_info")
/*  11:    */ public class Lead_bean
/*  12:    */ {
/*  13:    */   @Id
/*  14:    */   @GeneratedValue
/*  15:    */   private int id;
/*  16:    */   private String first_name;
/*  17:    */   private String last_name;
/*  18:    */   private String emails;
/*  19:    */   private String status_type;
/*  20:    */   private String status;
/*  21:    */   private String lead_source;
/*  22:    */   private String status_description;
/*  23:    */   private String lead_source_description;
/*  24:    */   private String opprtunity_ammount;
/*  25:    */   private String refered_by;
/*  26:    */   private String company_name;
/*  27:    */   private String assign_to;
/*  28:    */   private String user_comment;
/*  29:    */   private String created_by;
/*  30:    */   private String type_of_lead;
/*  31:    */   private String lead_title;
/*  32:    */   private String lead_mark_status;
/*  33:    */   private String website;
/*  34:    */   private String fax_no;
/*  35:    */   private String account_name;
/*  36:    */   @Column(name="mobile_no")
/*  37:    */   private String mobile_number;
/*  38:    */   private String convert_account_id;
/*  39:    */   private String tan_no;
/*  40:    */   private String pan_no;
/*  41:    */   private String sale_tax_no;
/*  42:    */   private String office_phone_no;
/*  43:    */   private String billing_street;
/*  44:    */   private String billing_city;
/*  45:    */   private String billing_state;
/*  46:    */   private String billing_postal_code;
/*  47:    */   private String billing_country;
/*  48:    */   private String ship_street;
/*  49:    */   private String ship_city;
/*  50:    */   private String ship_state;
/*  51:    */   private String ship_postal_code;
/*  52:    */   private String ship_country;
/*  53:    */   private String created_date;
private String lead_category;
private String product_required;
private String product_specification;
private String lead_other_category;
private String lead_note;

/*  54:    */   
/*  55:    */   public String getStatus()
/*  56:    */   {
/*  57: 35 */     return this.status;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setStatus(String status)
/*  61:    */   {
/*  62: 38 */     this.status = status;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getLead_source()
/*  66:    */   {
/*  67: 41 */     return this.lead_source;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setLead_source(String lead_source)
/*  71:    */   {
/*  72: 44 */     this.lead_source = lead_source;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getStatus_description()
/*  76:    */   {
/*  77: 47 */     return this.status_description;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setStatus_description(String status_description)
/*  81:    */   {
/*  82: 50 */     this.status_description = status_description;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getLead_source_description()
/*  86:    */   {
/*  87: 53 */     return this.lead_source_description;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setLead_source_description(String lead_source_description)
/*  91:    */   {
/*  92: 56 */     this.lead_source_description = lead_source_description;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getOpprtunity_ammount()
/*  96:    */   {
/*  97: 59 */     return this.opprtunity_ammount;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setOpprtunity_ammount(String opprtunity_ammount)
/* 101:    */   {
/* 102: 62 */     this.opprtunity_ammount = opprtunity_ammount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getRefered_by()
/* 106:    */   {
/* 107: 65 */     return this.refered_by;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setRefered_by(String refered_by)
/* 111:    */   {
/* 112: 68 */     this.refered_by = refered_by;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getAssign_to()
/* 116:    */   {
/* 117: 72 */     return this.assign_to;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setAssign_to(String assign_to)
/* 121:    */   {
/* 122: 75 */     this.assign_to = assign_to;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getStatus_type()
/* 126:    */   {
/* 127: 78 */     return this.status_type;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setStatus_type(String status_type)
/* 131:    */   {
/* 132: 81 */     this.status_type = status_type;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public int getId()
/* 136:    */   {
/* 137: 84 */     return this.id;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setId(int id)
/* 141:    */   {
/* 142: 87 */     this.id = id;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getFirst_name()
/* 146:    */   {
/* 147: 90 */     return this.first_name;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setFirst_name(String first_name)
/* 151:    */   {
/* 152: 93 */     this.first_name = first_name;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getLast_name()
/* 156:    */   {
/* 157: 96 */     return this.last_name;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setLast_name(String last_name)
/* 161:    */   {
/* 162: 99 */     this.last_name = last_name;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getEmails()
/* 166:    */   {
/* 167:102 */     return this.emails;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setEmails(String emails)
/* 171:    */   {
/* 172:105 */     this.emails = emails;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getTan_no()
/* 176:    */   {
/* 177:110 */     return this.tan_no;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setTan_no(String tan_no)
/* 181:    */   {
/* 182:113 */     this.tan_no = tan_no;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getPan_no()
/* 186:    */   {
/* 187:116 */     return this.pan_no;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setPan_no(String pan_no)
/* 191:    */   {
/* 192:119 */     this.pan_no = pan_no;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getSale_tax_no()
/* 196:    */   {
/* 197:122 */     return this.sale_tax_no;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setSale_tax_no(String sale_tax_no)
/* 201:    */   {
/* 202:125 */     this.sale_tax_no = sale_tax_no;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public String getOffice_phone_no()
/* 206:    */   {
/* 207:128 */     return this.office_phone_no;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void setOffice_phone_no(String office_phone_no)
/* 211:    */   {
/* 212:131 */     this.office_phone_no = office_phone_no;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public String getBilling_street()
/* 216:    */   {
/* 217:134 */     return this.billing_street;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public void setBilling_street(String billing_street)
/* 221:    */   {
/* 222:137 */     this.billing_street = billing_street;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public String getBilling_city()
/* 226:    */   {
/* 227:140 */     return this.billing_city;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void setBilling_city(String billing_city)
/* 231:    */   {
/* 232:143 */     this.billing_city = billing_city;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String getBilling_state()
/* 236:    */   {
/* 237:146 */     return this.billing_state;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public void setBilling_state(String billing_state)
/* 241:    */   {
/* 242:149 */     this.billing_state = billing_state;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public String getBilling_postal_code()
/* 246:    */   {
/* 247:152 */     return this.billing_postal_code;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void setBilling_postal_code(String billing_postal_code)
/* 251:    */   {
/* 252:155 */     this.billing_postal_code = billing_postal_code;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public String getBilling_country()
/* 256:    */   {
/* 257:158 */     return this.billing_country;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public void setBilling_country(String billing_country)
/* 261:    */   {
/* 262:161 */     this.billing_country = billing_country;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public String getShip_street()
/* 266:    */   {
/* 267:164 */     return this.ship_street;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public void setShip_street(String ship_street)
/* 271:    */   {
/* 272:167 */     this.ship_street = ship_street;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public String getShip_city()
/* 276:    */   {
/* 277:170 */     return this.ship_city;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void setShip_city(String ship_city)
/* 281:    */   {
/* 282:173 */     this.ship_city = ship_city;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public String getShip_state()
/* 286:    */   {
/* 287:176 */     return this.ship_state;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public void setShip_state(String ship_state)
/* 291:    */   {
/* 292:179 */     this.ship_state = ship_state;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public String getShip_postal_code()
/* 296:    */   {
/* 297:182 */     return this.ship_postal_code;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public void setShip_postal_code(String ship_postal_code)
/* 301:    */   {
/* 302:185 */     this.ship_postal_code = ship_postal_code;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public String getShip_country()
/* 306:    */   {
/* 307:188 */     return this.ship_country;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public void setShip_country(String ship_country)
/* 311:    */   {
/* 312:191 */     this.ship_country = ship_country;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public String getWebsite()
/* 316:    */   {
/* 317:196 */     return this.website;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public void setWebsite(String website)
/* 321:    */   {
/* 322:199 */     this.website = website;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public String getMobile_number()
/* 326:    */   {
/* 327:234 */     return this.mobile_number;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public void setMobile_number(String mobile_number)
/* 331:    */   {
/* 332:241 */     this.mobile_number = mobile_number;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public String getAccount_name()
/* 336:    */   {
/* 337:248 */     return this.account_name;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public void setAccount_name(String account_name)
/* 341:    */   {
/* 342:255 */     this.account_name = account_name;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public String getUser_comment()
/* 346:    */   {
/* 347:262 */     return this.user_comment;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public void setUser_comment(String user_comment)
/* 351:    */   {
/* 352:269 */     this.user_comment = user_comment;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public String getCreated_by()
/* 356:    */   {
/* 357:276 */     return this.created_by;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public void setCreated_by(String created_by)
/* 361:    */   {
/* 362:283 */     this.created_by = created_by;
/* 363:    */   }
/* 364:    */   
/* 365:    */   public String getCreated_date()
/* 366:    */   {
/* 367:289 */     return this.created_date;
/* 368:    */   }
/* 369:    */   
/* 370:    */   public void setCreated_date(String created_date)
/* 371:    */   {
/* 372:296 */     this.created_date = created_date;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public String getFax_no()
/* 376:    */   {
/* 377:303 */     return this.fax_no;
/* 378:    */   }
/* 379:    */   
/* 380:    */   public void setFax_no(String fax_no)
/* 381:    */   {
/* 382:310 */     this.fax_no = fax_no;
/* 383:    */   }
/* 384:    */   
/* 385:    */   public String getConvert_account_id()
/* 386:    */   {
/* 387:317 */     return this.convert_account_id;
/* 388:    */   }
/* 389:    */   
/* 390:    */   public void setConvert_account_id(String convert_account_id)
/* 391:    */   {
/* 392:324 */     this.convert_account_id = convert_account_id;
/* 393:    */   }
/* 394:    */   
/* 395:    */   public String getCompany_name()
/* 396:    */   {
/* 397:331 */     return this.company_name;
/* 398:    */   }
/* 399:    */   
/* 400:    */   public void setCompany_name(String company_name)
/* 401:    */   {
/* 402:338 */     this.company_name = company_name;
/* 403:    */   }
/* 404:    */   
/* 405:    */   public String getType_of_lead()
/* 406:    */   {
/* 407:345 */     return this.type_of_lead;
/* 408:    */   }
/* 409:    */   
/* 410:    */   public void setType_of_lead(String type_of_lead)
/* 411:    */   {
/* 412:352 */     this.type_of_lead = type_of_lead;
/* 413:    */   }
/* 414:    */   
/* 415:    */   public String getLead_title()
/* 416:    */   {
/* 417:359 */     return this.lead_title;
/* 418:    */   }
/* 419:    */   
/* 420:    */   public void setLead_title(String lead_title)
/* 421:    */   {
/* 422:366 */     this.lead_title = lead_title;
/* 423:    */   }
/* 424:    */   
/* 425:    */   public String getLead_mark_status()
/* 426:    */   {
/* 427:373 */     return this.lead_mark_status;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public void setLead_mark_status(String lead_mark_status)
/* 431:    */   {
/* 432:380 */     this.lead_mark_status = lead_mark_status;
/* 433:    */   }
/* 434:    */

    /**
     * @return the lead_category
     */
    public String getLead_category() {
        return lead_category;
    }

    /**
     * @param lead_category the lead_category to set
     */
    public void setLead_category(String lead_category) {
        this.lead_category = lead_category;
    }

    /**
     * @return the product_required
     */
    public String getProduct_required() {
        return product_required;
    }

    /**
     * @param product_required the product_required to set
     */
    public void setProduct_required(String product_required) {
        this.product_required = product_required;
    }

    /**
     * @return the product_specification
     */
    public String getProduct_specification() {
        return product_specification;
    }

    /**
     * @param product_specification the product_specification to set
     */
    public void setProduct_specification(String product_specification) {
        this.product_specification = product_specification;
    }

    /**
     * @return the lead_other_category
     */
    public String getLead_other_category() {
        return lead_other_category;
    }

    /**
     * @param lead_other_category the lead_other_category to set
     */
    public void setLead_other_category(String lead_other_category) {
        this.lead_other_category = lead_other_category;
    }

    /**
     * @return the lead_note
     */
    public String getLead_note() {
        return lead_note;
    }

    /**
     * @param lead_note the lead_note to set
     */
    public void setLead_note(String lead_note) {
        this.lead_note = lead_note;
    }

  
 }



/* Location:           D:\CRM\SHIVIT_CRM\WEB-INF\classes\

 * Qualified Name:     lead.beans.Lead_bean

 * JD-Core Version:    0.7.0.1

 */