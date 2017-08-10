package bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuxiaoqi on 2017/7/25.
 * 使用GsonFormat生成
 * 首页轮播图Bean
 */

public class TurnPictureBean implements Serializable {

    private ResultBeanXXXXXXXXXXXXXXXXX result;
    private int error_code;
    private List<ModuleBean> module;

    public ResultBeanXXXXXXXXXXXXXXXXX getResult() {
        return result;
    }

    public void setResult(ResultBeanXXXXXXXXXXXXXXXXX result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ModuleBean> getModule() {
        return module;
    }

    public void setModule(List<ModuleBean> module) {
        this.module = module;
    }

    public static class ResultBeanXXXXXXXXXXXXXXXXX {
        private Mix1Bean mix_1;
        private Mod29Bean mod_29;
        private Mix29Bean mix_29;
        private Mod7Bean mod_7;
        private Mix5Bean mix_5;
        private RecsongBean recsong;
        private ShowListBean show_list;
        private Mix22Bean mix_22;
        private NewSongBean new_song;
        private Mix61Bean mix_61;
        private Mix9Bean mix_9;
        private RadioBean radio;
        private EntryBean entry;
        private FocusBean focus;
        private SceneBean scene;
        private DiyBean diy;
        private KingBean king;

        public Mix1Bean getMix_1() {
            return mix_1;
        }

        public void setMix_1(Mix1Bean mix_1) {
            this.mix_1 = mix_1;
        }

        public Mod29Bean getMod_29() {
            return mod_29;
        }

        public void setMod_29(Mod29Bean mod_29) {
            this.mod_29 = mod_29;
        }

        public Mix29Bean getMix_29() {
            return mix_29;
        }

        public void setMix_29(Mix29Bean mix_29) {
            this.mix_29 = mix_29;
        }

        public Mod7Bean getMod_7() {
            return mod_7;
        }

        public void setMod_7(Mod7Bean mod_7) {
            this.mod_7 = mod_7;
        }

        public Mix5Bean getMix_5() {
            return mix_5;
        }

        public void setMix_5(Mix5Bean mix_5) {
            this.mix_5 = mix_5;
        }

        public RecsongBean getRecsong() {
            return recsong;
        }

        public void setRecsong(RecsongBean recsong) {
            this.recsong = recsong;
        }

        public ShowListBean getShow_list() {
            return show_list;
        }

        public void setShow_list(ShowListBean show_list) {
            this.show_list = show_list;
        }

        public Mix22Bean getMix_22() {
            return mix_22;
        }

        public void setMix_22(Mix22Bean mix_22) {
            this.mix_22 = mix_22;
        }

        public NewSongBean getNew_song() {
            return new_song;
        }

        public void setNew_song(NewSongBean new_song) {
            this.new_song = new_song;
        }

        public Mix61Bean getMix_61() {
            return mix_61;
        }

        public void setMix_61(Mix61Bean mix_61) {
            this.mix_61 = mix_61;
        }

        public Mix9Bean getMix_9() {
            return mix_9;
        }

        public void setMix_9(Mix9Bean mix_9) {
            this.mix_9 = mix_9;
        }

        public RadioBean getRadio() {
            return radio;
        }

        public void setRadio(RadioBean radio) {
            this.radio = radio;
        }

        public EntryBean getEntry() {
            return entry;
        }

        public void setEntry(EntryBean entry) {
            this.entry = entry;
        }

        public FocusBean getFocus() {
            return focus;
        }

        public void setFocus(FocusBean focus) {
            this.focus = focus;
        }

        public SceneBean getScene() {
            return scene;
        }

        public void setScene(SceneBean scene) {
            this.scene = scene;
        }

        public DiyBean getDiy() {
            return diy;
        }

        public void setDiy(DiyBean diy) {
            this.diy = diy;
        }

        public KingBean getKing() {
            return king;
        }

        public void setKing(KingBean king) {
            this.king = king;
        }

        public static class Mix1Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"7月新歌速递","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499793382cebe2d826707e4b6e11b86f8cd8af34b.jpg","type_id":"367208682","type":0,"title":"新歌抢鲜听","tip_type":0,"author":"7月新歌速递"},{"desc":"胡宇威","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500953390c68deba03f614a48770ac7e7928364d7.jpg","type_id":"544527746","type":2,"title":"DO NOT DISTURB请不要打扰","tip_type":3,"author":"胡宇威"},{"desc":"那英","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15009487528baa081146a758d2cc2d16e7bd6c6808.jpg","type_id":"548214525","type":2,"title":"三生三世十里桃花","tip_type":0,"author":"那英"},{"desc":"郭峰","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500948650a5df261e431476623c4170f4eee8a447.jpg","type_id":"548214291","type":2,"title":"再也看不见","tip_type":0,"author":"郭峰"},{"desc":"董力","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500948573fe7382165d83a2e8cd1225346aba0162.jpg","type_id":"547253486","type":2,"title":"董大力","tip_type":0,"author":"董力"},{"desc":"孔令奇/满舒克","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500864786c7b445afcf7170326cec1ebb6fda7654.jpg","type_id":"548004160","type":2,"title":"Real Life","tip_type":0,"author":"孔令奇/满舒克"}]
             */

            private int error_code;
            private List<ResultBean> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBean> getResult() {
                return result;
            }

            public void setResult(List<ResultBean> result) {
                this.result = result;
            }

            public static class ResultBean {
                /**
                 * desc : 7月新歌速递
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499793382cebe2d826707e4b6e11b86f8cd8af34b.jpg
                 * type_id : 367208682
                 * type : 0
                 * title : 新歌抢鲜听
                 * tip_type : 0
                 * author : 7月新歌速递
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mod29Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_149217051946506880bece60f7fc94641aa8ae8bc5.jpg","type_id":"http://music.baidu.com/cms/webview/xiha/gs/index.html","type":4,"title":"滚石唱片音乐专区","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanX> result) {
                this.result = result;
            }

            public static class ResultBeanX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_149217051946506880bece60f7fc94641aa8ae8bc5.jpg
                 * type_id : http://music.baidu.com/cms/webview/xiha/gs/index.html
                 * type : 4
                 * title : 滚石唱片音乐专区
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix29Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500960364442e21ac3185c55e12bbb9c7c5e5f589.jpg","type_id":"544260632","type":2,"title":"阿拉伯电子趴，贵族般的优雅","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500885843776885cb7410f3ab7473af9fd597e96d.jpg","type_id":"314034204","type":2,"title":"北欧小电音，祛暑小清新","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150062615622b5f55a5f1ec435af364cd7c27e783d.jpg","type_id":"278527889","type":2,"title":"听戏品tea，滋味神奇","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXX> result) {
                this.result = result;
            }

            public static class ResultBeanXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500960364442e21ac3185c55e12bbb9c7c5e5f589.jpg
                 * type_id : 544260632
                 * type : 2
                 * title : 阿拉伯电子趴，贵族般的优雅
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mod7Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"爱豆SHOW VOL.34 | 带你跟进新、热idol和话题的脚步","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15006188767a5aecfccdb2d7d569e612edb8031cff.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=534&columnid=86","type":4,"title":"对不起！我只知道R&B！","tip_type":0,"author":""},{"desc":"音乐大人物 | 带给你绝妙的音乐，独特的故事","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150070409210b24f41e83297f4ae815f8a02892547.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=535&columnid=92","type":4,"title":"\u201c小迷糊\u201d张靓颖： 洗面奶当成牙膏 上厕所错过演出","tip_type":0,"author":""},{"desc":"一周音乐热 | 网罗一周乐坛动态！","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500978606d9ede89fb44930fd9b83fde96dabca7e.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=543&columnid=87","type":4,"title":"MUSICHOT87 | 关于Linkin Park最后的纪念","tip_type":0,"author":""},{"desc":"《大内密谈》入驻百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500963019413863a8ba5fe97ac2fb78e3cb998b5b.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=542&columnid=128","type":4,"title":"vol.433 看得见音乐的城市pt.10 台北篇","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15008703617003ced63d6b2835a216498a394ae3d4.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=533&columnid=132","type":4,"title":"刘力扬亲自化身为陪跑主播：华语乐享动特别节目","tip_type":0,"author":""},{"desc":"明星私房歌 | 听偶像推荐的歌","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977079abdd671bc2487b493883393466bee1a6.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=545&columnid=84","type":4,"title":"SNH48的私房歌单：粉红少女给你夏日清凉","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500629722c2986dfd90a340d21c9bd4ee8c5d3df5.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=517&columnid=126","type":4,"title":"从现在起，别再说你不知道4AD了！(中)","tip_type":0,"author":""},{"desc":"百度音乐独家DJ节目《有待咖啡》 | 第46期","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500535152019d01e1e994ba4e9d7890d9fc97f9eb.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=531&columnid=89","type":4,"title":"为什么顶尖级爵士&灵魂乐大师都争相与他合作？","tip_type":0,"author":""},{"desc":"百度音乐独家DJ节目《在云端》 | 第26期","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1498812936c6a96060da21a0ba4ae51f5f6115c125.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=424&columnid=88","type":4,"title":"绝对不能错过的 \u201c华语乐坛概念唱片\u201d（3）","tip_type":0,"author":""},{"desc":"《日谈公园》入驻百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499069152451e185abccc01b4ae94f7ad1bf8c077.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=428&columnid=120","type":4,"title":"一起走进创乐者：陈鸿宇","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXX {
                /**
                 * desc : 爱豆SHOW VOL.34 | 带你跟进新、热idol和话题的脚步
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_15006188767a5aecfccdb2d7d569e612edb8031cff.jpg
                 * type_id : http://music.baidu.com/h5pc/spec_detail?id=534&columnid=86
                 * type : 4
                 * title : 对不起！我只知道R&B！
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix5Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"李若溪","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500886634b4fbc851e0a57c1a3184efc37646b3c5.jpg","type_id":"548190928","type":5,"title":"滂沱大雨里（《我的前半生》电视剧歌曲）","tip_type":0,"author":"李若溪"},{"desc":"张信哲","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150034690493a543fd331eb3311f15c7942835df8f.jpg","type_id":"545982609","type":5,"title":"说","tip_type":0,"author":"张信哲"},{"desc":"黄子韬","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150027608072429af2b3044d8f4628b06a802df1d9.jpg","type_id":"545935689","type":5,"title":"还来得及","tip_type":0,"author":"黄子韬"},{"desc":"鹿晗","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15000145810f3b691d17a0fdaafd9cd4f8c3ec96d4.jpg","type_id":"545479726","type":5,"title":"零界点（On fire）","tip_type":0,"author":"鹿晗"},{"desc":"石头","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500013671f31705d678a5773db49c0545a9894a05.jpg","type_id":"545477074","type":5,"title":"离开","tip_type":0,"author":"石头"},{"desc":"金志文","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15000024974a134b7d0d5557827df269ff1792b43d.jpg","type_id":"545298491","type":5,"title":"一望千年（电视剧《上古情歌》插曲）","tip_type":0,"author":"金志文"}]
             */

            private int error_code;
            private List<ResultBeanXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXX {
                /**
                 * desc : 李若溪
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500886634b4fbc851e0a57c1a3184efc37646b3c5.jpg
                 * type_id : 548190928
                 * type : 5
                 * title : 滂沱大雨里（《我的前半生》电视剧歌曲）
                 * tip_type : 0
                 * author : 李若溪
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class RecsongBean {

            private int error_code;
            private List<ResultBeanXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXX {
                /**
                 * resource_type_ext : 0
                 * versions :
                 * info :
                 * learn : 1
                 * copy_type : 1
                 * has_filmtv : 0
                 * pic_premium : http://musicdata.baidu.com/data2/pic/40086909/40086909.jpg@s_0,w_500
                 * title : 空白格
                 * song_id : 341541
                 * method : 1
                 * has_mv_mobile : 1
                 * bitrate_fee : {"0":"0|0","1":"0|0"}
                 * biaoshi : lossless
                 * korean_bb_song : 0
                 * del_status : 0
                 * author : 蔡健雅
                 */

                private String resource_type_ext;
                private String versions;
                private String info;
                private String learn;
                private String copy_type;
                private String has_filmtv;
                private String pic_premium;
                private String title;
                private String song_id;
                private String method;
                private String has_mv_mobile;
                private String bitrate_fee;
                private String biaoshi;
                private String korean_bb_song;
                private String del_status;
                private String author;

                public String getResource_type_ext() {
                    return resource_type_ext;
                }

                public void setResource_type_ext(String resource_type_ext) {
                    this.resource_type_ext = resource_type_ext;
                }

                public String getVersions() {
                    return versions;
                }

                public void setVersions(String versions) {
                    this.versions = versions;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getLearn() {
                    return learn;
                }

                public void setLearn(String learn) {
                    this.learn = learn;
                }

                public String getCopy_type() {
                    return copy_type;
                }

                public void setCopy_type(String copy_type) {
                    this.copy_type = copy_type;
                }

                public String getHas_filmtv() {
                    return has_filmtv;
                }

                public void setHas_filmtv(String has_filmtv) {
                    this.has_filmtv = has_filmtv;
                }

                public String getPic_premium() {
                    return pic_premium;
                }

                public void setPic_premium(String pic_premium) {
                    this.pic_premium = pic_premium;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSong_id() {
                    return song_id;
                }

                public void setSong_id(String song_id) {
                    this.song_id = song_id;
                }

                public String getMethod() {
                    return method;
                }

                public void setMethod(String method) {
                    this.method = method;
                }

                public String getHas_mv_mobile() {
                    return has_mv_mobile;
                }

                public void setHas_mv_mobile(String has_mv_mobile) {
                    this.has_mv_mobile = has_mv_mobile;
                }

                public String getBitrate_fee() {
                    return bitrate_fee;
                }

                public void setBitrate_fee(String bitrate_fee) {
                    this.bitrate_fee = bitrate_fee;
                }

                public String getBiaoshi() {
                    return biaoshi;
                }

                public void setBiaoshi(String biaoshi) {
                    this.biaoshi = biaoshi;
                }

                public String getKorean_bb_song() {
                    return korean_bb_song;
                }

                public void setKorean_bb_song(String korean_bb_song) {
                    this.korean_bb_song = korean_bb_song;
                }

                public String getDel_status() {
                    return del_status;
                }

                public void setDel_status(String del_status) {
                    this.del_status = del_status;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class ShowListBean {
            /**
             * error_code : 22000
             * result : [{"type":"learn","picture_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_2bc81ed7070a7db830a9c8309080d2f4.jpg","picture":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_2b983ddd40a431e1b66a6cb290f0a770.jpg","web_url":"http://music.baidu.com/cms/webview/ktv_activity/20170112/"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXX {
                /**
                 * type : learn
                 * picture_iphone6 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_2bc81ed7070a7db830a9c8309080d2f4.jpg
                 * picture : http://business.cdn.qianqian.com/qianqian/pic/bos_client_2b983ddd40a431e1b66a6cb290f0a770.jpg
                 * web_url : http://music.baidu.com/cms/webview/ktv_activity/20170112/
                 */

                private String type;
                private String picture_iphone6;
                private String picture;
                private String web_url;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getPicture_iphone6() {
                    return picture_iphone6;
                }

                public void setPicture_iphone6(String picture_iphone6) {
                    this.picture_iphone6 = picture_iphone6;
                }

                public String getPicture() {
                    return picture;
                }

                public void setPicture(String picture) {
                    this.picture = picture;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }
            }
        }

        public static class Mix22Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"旅行团乐队","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14993104941a77a4ead01058192aba919301be8487.jpg","type_id":"543981425","type":2,"title":"永远都会在","tip_type":0,"author":"旅行团乐队"},{"desc":"小太空","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1498022208a5a1908021390b7eed99fa1a09d38575.jpg","type_id":"542032233","type":2,"title":"Faye飞","tip_type":0,"author":"Faye飞"},{"desc":"刘瑞琦","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14951617795e40f8c0aa3c6fd249f249f08791a8e1.jpg","type_id":"541297473","type":2,"title":"晚安，琦","tip_type":0,"author":"刘瑞琦"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXX {
                /**
                 * desc : 旅行团乐队
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_14993104941a77a4ead01058192aba919301be8487.jpg
                 * type_id : 543981425
                 * type : 2
                 * title : 永远都会在
                 * tip_type : 0
                 * author : 旅行团乐队
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class NewSongBean {
            /**
             * error_code : 22000
             * result : {"pic_500":"http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab64bcae572ef136afc378311e7b.jpg","listid":"5126","song_info":[{"song_id":"261812117","title":"二十四小时","pic_premium":"http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500","author":"陈坤,韩庚,大鹏,吴磊,尹正"},{"song_id":"74109283","title":"灵主不悔《画江湖之灵主》手游暨动漫主题曲","author":"汪苏泷"},{"song_id":"261496612","title":"Protocole","pic_premium":"http://qukufile2.qianqian.com/data2/pic/07a830e962bbb4e58e29842f45d44b66/261496583/261496583.jpg@s_0,w_500","author":"Alpha Wann"}]}
             */

            private int error_code;
            private ResultBeanXXXXXXXX result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public ResultBeanXXXXXXXX getResult() {
                return result;
            }

            public void setResult(ResultBeanXXXXXXXX result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXX {
                /**
                 * pic_500 : http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab64bcae572ef136afc378311e7b.jpg
                 * listid : 5126
                 * song_info : [{"song_id":"261812117","title":"二十四小时","pic_premium":"http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500","author":"陈坤,韩庚,大鹏,吴磊,尹正"},{"song_id":"74109283","title":"灵主不悔《画江湖之灵主》手游暨动漫主题曲","author":"汪苏泷"},{"song_id":"261496612","title":"Protocole","pic_premium":"http://qukufile2.qianqian.com/data2/pic/07a830e962bbb4e58e29842f45d44b66/261496583/261496583.jpg@s_0,w_500","author":"Alpha Wann"}]
                 */

                private String pic_500;
                private String listid;
                private List<SongInfoBean> song_info;

                public String getPic_500() {
                    return pic_500;
                }

                public void setPic_500(String pic_500) {
                    this.pic_500 = pic_500;
                }

                public String getListid() {
                    return listid;
                }

                public void setListid(String listid) {
                    this.listid = listid;
                }

                public List<SongInfoBean> getSong_info() {
                    return song_info;
                }

                public void setSong_info(List<SongInfoBean> song_info) {
                    this.song_info = song_info;
                }

                public static class SongInfoBean {
                    /**
                     * song_id : 261812117
                     * title : 二十四小时
                     * pic_premium : http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500
                     * author : 陈坤,韩庚,大鹏,吴磊,尹正
                     */

                    private String song_id;
                    private String title;
                    private String pic_premium;
                    private String author;

                    public String getSong_id() {
                        return song_id;
                    }

                    public void setSong_id(String song_id) {
                        this.song_id = song_id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getPic_premium() {
                        return pic_premium;
                    }

                    public void setPic_premium(String pic_premium) {
                        this.pic_premium = pic_premium;
                    }

                    public String getAuthor() {
                        return author;
                    }

                    public void setAuthor(String author) {
                        this.author = author;
                    }
                }
            }
        }

        public static class Mix61Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"东风日产×百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500398969ca8beef2f05964af04f609506712220d.jpg","type_id":"http://music.baidu.com/cms/webview/topic_activity/plazanissan/index.html?showminibar=0&hideplay=1","type":4,"title":"突破次元·理想音乐第三季","tip_type":0,"author":"东风日产×百度音乐"},{"desc":"耀乐团/洛天依","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14983950160158e275e13c93aff6e51b53ddbabfb7.jpg","type_id":"543817814","type":2,"title":"光速行者","tip_type":0,"author":"耀乐团/洛天依"},{"desc":"东风日产×百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_149874186641d5837a9a190b4f5d3ab2700ba30ded.jpg","type_id":"http://music.baidu.com/cms/webview/song_vote/dfrc/index.html","type":4,"title":"X-Voice次元偶像大赛火热报名中！","tip_type":0,"author":"东风日产×百度音乐"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXX {
                /**
                 * desc : 东风日产×百度音乐
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500398969ca8beef2f05964af04f609506712220d.jpg
                 * type_id : http://music.baidu.com/cms/webview/topic_activity/plazanissan/index.html?showminibar=0&hideplay=1
                 * type : 4
                 * title : 突破次元·理想音乐第三季
                 * tip_type : 0
                 * author : 东风日产×百度音乐
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix9Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500867735325c48e9f337440855b5d36038cced86.jpg","type_id":"http://y.baidu.com/cms/topic/webapp/2017/anzi/index.html","type":4,"title":"永远唱下去，是我们从未变过的音乐梦想","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499667154777477c24985f130fd1be67257d7f5e9.jpg","type_id":"http://y.baidu.com/tbang/","type":4,"title":"TBANG榜单揭晓","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1495188132696c6e7e59686e0ed03804c2dc2e0dd5.jpg","type_id":"http://music.baidu.com/cms/webview/song_vote/ws/index.html","type":4,"title":"麦克成风2017赛季启动，城市投票赛ing","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500867735325c48e9f337440855b5d36038cced86.jpg
                 * type_id : http://y.baidu.com/cms/topic/webapp/2017/anzi/index.html
                 * type : 4
                 * title : 永远唱下去，是我们从未变过的音乐梦想
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class RadioBean {
            /**
             * error_code : 22000
             * result : [{"desc":"音乐推荐","itemid":"13496780","title":"有待咖啡","album_id":"13420707","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_019d01e1e994ba4e9d7890d9fc97f9eb.jpg"},{"desc":"音乐推荐","itemid":"13496374","title":"这样的罗大佑，你可能不太熟","album_id":"5945591","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_7894c83e731b9a8f4954fab18694db81.jpg"},{"desc":"都市情感","itemid":"13472541","title":"人生：十二年一个圆满或者缺憾","album_id":"12774274","type":"lebo","channelid":"11373553","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_01273c7cc2c630d44cbfd62d42a4c805.jpg"},{"desc":"段子笑话","itemid":"13497641","title":"胖友说，留言前100名让我带大家去吃小龙虾","album_id":"12380502","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_df5523f3cfd5a3266d669e085b5f1a5a.jpg"},{"desc":"音乐推荐","itemid":"13484227","title":"罗大佑丨光阴带走青春，留下了故事","album_id":"13384406","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1e1f1cd57cd27d41a4d7eba22deb94ea.jpg"},{"desc":"教育","itemid":"13487126","title":"《小学生必背古诗词70+80》20：九月九日忆山东兄弟","album_id":"13483086","type":"lebo","channelid":"11373555","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_7d8839a780a4d599e245cefcebdd1d70.jpg"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXX {
                /**
                 * desc : 音乐推荐
                 * itemid : 13496780
                 * title : 有待咖啡
                 * album_id : 13420707
                 * type : lebo
                 * channelid : 11373552
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_019d01e1e994ba4e9d7890d9fc97f9eb.jpg
                 */

                private String desc;
                private String itemid;
                private String title;
                private String album_id;
                private String type;
                private String channelid;
                private String pic;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getItemid() {
                    return itemid;
                }

                public void setItemid(String itemid) {
                    this.itemid = itemid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAlbum_id() {
                    return album_id;
                }

                public void setAlbum_id(String album_id) {
                    this.album_id = album_id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getChannelid() {
                    return channelid;
                }

                public void setChannelid(String channelid) {
                    this.channelid = channelid;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }
            }
        }

        public static class EntryBean {
            /**
             * error_code : 22000
             * result : [{"day":"","title":"歌手","icon":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14639875926652ed7c4988517cab87526f15d8f359.jpg","jump":"2"},{"day":"","title":"歌曲分类","icon":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_146398764316d87d01865b91f90a598777b1569fdf.jpg","jump":"1"},{"day":"25","title":"今日推荐歌曲","icon":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1463987629793f4361391282bde14d9b19156cfac3.jpg","jump":"0"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXX {
                /**
                 * day :
                 * title : 歌手
                 * icon : http://business.cdn.qianqian.com/qianqian/pic/bos_client_14639875926652ed7c4988517cab87526f15d8f359.jpg
                 * jump : 2
                 */

                private String day;
                private String title;
                private String icon;
                private String jump;

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getJump() {
                    return jump;
                }

                public void setJump(String jump) {
                    this.jump = jump;
                }
            }
        }

        public static class FocusBean {
            /**
             * error_code : 22000
             * result : [{"is_publish":"111111","code":"http://music.baidu.com/cms/webview/topic_activity/dfzl02/","type":6,"randpic_desc":"","mo_type":4,"randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg","randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg"},{"is_publish":"111111","code":"http://music.baidu.com/h5pc/spec_detail?id=543&columnid=87","type":6,"randpic_desc":"MUSICHOT87 | 关于Linkin Park最后的纪念","mo_type":4,"randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977749e26f17f289cdfe7fc03c694d98e7eab2.jpg","randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977749e26f17f289cdfe7fc03c694d98e7eab2.jpg"},{"is_publish":"111111","code":"http://music.baidu.com/h5pc/spec_detail?id=545&columnid=84","type":6,"randpic_desc":"SNH48的私房歌单：粉红少女给你夏日清凉","mo_type":4,"randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977934b6ef8bd5cef1ce6db9731abefa158f3d.jpg","randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977934b6ef8bd5cef1ce6db9731abefa158f3d.jpg"},{"is_publish":"111111","code":"http://music.baidu.com/h5pc/spec_detail?id=542&columnid=128","type":6,"randpic_desc":"vol.433 看得见音乐的城市pt.10 台北篇","mo_type":4,"randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500958056b1846959c2fbb425b4a759c7fddbd53e.jpg","randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500958056b1846959c2fbb425b4a759c7fddbd53e.jpg"},{"is_publish":"111111","code":"548214291","type":2,"randpic_desc":"","mo_type":2,"randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500952214b2190d3a230fa8afd2e8c25478fa67fa.jpg","randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500952214b2190d3a230fa8afd2e8c25478fa67fa.jpg"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXX {
                /**
                 * is_publish : 111111
                 * code : http://music.baidu.com/cms/webview/topic_activity/dfzl02/
                 * type : 6
                 * randpic_desc :
                 * mo_type : 4
                 * randpic_iphone6 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg
                 * randpic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg
                 */

                private String is_publish;
                private String code;
                private int type;
                private String randpic_desc;
                private int mo_type;
                private String randpic_iphone6;
                private String randpic;

                public String getIs_publish() {
                    return is_publish;
                }

                public void setIs_publish(String is_publish) {
                    this.is_publish = is_publish;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getRandpic_desc() {
                    return randpic_desc;
                }

                public void setRandpic_desc(String randpic_desc) {
                    this.randpic_desc = randpic_desc;
                }

                public int getMo_type() {
                    return mo_type;
                }

                public void setMo_type(int mo_type) {
                    this.mo_type = mo_type;
                }

                public String getRandpic_iphone6() {
                    return randpic_iphone6;
                }

                public void setRandpic_iphone6(String randpic_iphone6) {
                    this.randpic_iphone6 = randpic_iphone6;
                }

                public String getRandpic() {
                    return randpic;
                }

                public void setRandpic(String randpic) {
                    this.randpic = randpic;
                }
            }
        }

        public static class SceneBean {
            /**
             * result : {"action":[{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/94cad1c8a786c917cd5a64c9cf3d70cf3ac757e0.jpg","scene_name":"在路上","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/b999a9014c086e06604a914805087bf40bd1cbd7.jpg","scene_model":"2","scene_desc":"","bgpic_ios":"","scene_id":"0"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/377adab44aed2e738e8eb6dc8101a18b86d6fade.jpg","scene_name":"睡眠","bgpic_android":"","icon_android":"http://d.hiphotos.baidu.com/ting/pic/item/3ac79f3df8dcd1009a0e5122758b4710b9122f26.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"9"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b3fb43166d224f4a0e1143e30ff790529922d1b1.jpg","scene_name":"一个人","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/f636afc379310a55e4d177f7b04543a98226103f.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"10"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/a5c27d1ed21b0ef4d176a9aedbc451da80cb3ea7.jpg","scene_name":"放松","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/0b7b02087bf40ad1e3996ee0502c11dfa9ecceb0.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"8"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b3fb43166d224f4a0e1143e30ff790529922d1b1.jpg","scene_name":"一个人","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/f636afc379310a55e4d177f7b04543a98226103f.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"10"}],"emotion":[{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/f3d3572c11dfa9ec87c175e764d0f703908fc156.jpg","scene_name":"悲伤","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/d058ccbf6c81800ae39f160db63533fa828b47bf.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"36"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/09fa513d269759ee2a59433bb4fb43166d22df30.jpg","scene_name":"空虚寂寞冷","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/472309f790529822ff4fa6c0d0ca7bcb0a46d4b1.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"35"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/d058ccbf6c81800a94d3a4feb73533fa828b470f.jpg","scene_name":"思念","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/aa64034f78f0f736eac8d2020d55b319ebc413fa.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"41"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/7acb0a46f21fbe094353e1e46d600c338744ad34.jpg","scene_name":"轻松","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/bf096b63f6246b609bc02d77ecf81a4c500fa2e3.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"40"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/d4628535e5dde711fba36e06a1efce1b9c1661c8.jpg","scene_name":"安静","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/267f9e2f0708283878654217bf99a9014c08f14d.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"81"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/3c6d55fbb2fb431677aa588a26a4462308f7d38c.jpg","scene_name":"醉了","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/5ab5c9ea15ce36d37d9c1c333df33a87e950b11d.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"39"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/9d82d158ccbf6c810ea60f18ba3eb13532fa40a8.jpg","scene_name":"治愈","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/472309f790529822ffa5a6c0d0ca7bcb0a46d41b.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"37"}],"operation":[{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/18d8bc3eb13533faf2ba9fa3aed3fd1f41345b2a.jpg","scene_name":"网络歌曲","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7ca73313874f51fbe096a63a9e8.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"156"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/4a36acaf2edda3cc469cb5ad07e93901203f92c6.jpg","scene_name":"校园歌曲","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/a71ea8d3fd1f4134ed57037c221f95cad1c85e4b.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"160"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/bd3eb13533fa828bd727916efb1f4134970a5a32.jpg","scene_name":"新歌抢鲜听","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/9213b07eca8065382359a31190dda144ad348204.jpg","scene_model":"1","scene_desc":"网罗全球最新歌曲","bgpic_ios":"","scene_id":"33"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/d01373f082025aaff566d3a4fcedab64034f1a0c.jpg","scene_name":"热歌","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/838ba61ea8d3fd1f55b20f55374e251f95ca5f21.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"162"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/dbb44aed2e738bd461c6bebca78b87d6267ff95c.jpg","scene_name":"情人节","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/63d0f703918fa0ecfe25630f219759ee3c6ddbd6.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"155"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/cb8065380cd79123bb1999f9ab345982b3b78045.jpg","scene_name":"小清新","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/80cb39dbb6fd526672003a16ac18972bd407368c.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"158"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/faedab64034f78f04fd1977e7f310a55b2191c60.jpg","scene_name":"古风","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/2cf5e0fe9925bc313c5e079a59df8db1cb1370b4.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"157"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/c2fdfc039245d6884448bf29a2c27d1ed31b24f0.jpg","scene_name":"经典老歌","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/d058ccbf6c81800a68b98f0cb63533fa828b4757.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"161"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/c8ea15ce36d3d539961d09c13d87e950352ab08b.jpg","scene_name":"舒缓","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/0824ab18972bd40792add5ff7c899e510fb3094d.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"159"}],"other":[{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b3b7d0a20cf431ad9bb26ac94d36acaf2fdd98d9.jpg","scene_name":"流行","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab6443ffd5c3f036afc379311e27.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"48"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/377adab44aed2e7364d7a8dc8101a18b87d6fa00.jpg","scene_name":"2000年代","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/aa64034f78f0f736ec9dd4020d55b319ebc41355.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"71"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b2de9c82d158ccbfe74098ca1fd8bc3eb0354145.jpg","scene_name":"国语","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/d439b6003af33a87423e9e19c15c10385343b566.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"42"}]}
             * error_code : 22000
             * config : [{"color_other":"","play_color":"","scene_version":0,"desc":"","end_time":0,"start_time":0,"scene_color":"","bgpic":"","bgpic_special":"","button_color":""}]
             */

            private ResultBeanXXXXXXXXXXXXXX result;
            private int error_code;
            private List<ConfigBean> config;

            public ResultBeanXXXXXXXXXXXXXX getResult() {
                return result;
            }

            public void setResult(ResultBeanXXXXXXXXXXXXXX result) {
                this.result = result;
            }

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ConfigBean> getConfig() {
                return config;
            }

            public void setConfig(List<ConfigBean> config) {
                this.config = config;
            }

            public static class ResultBeanXXXXXXXXXXXXXX {
                private List<ActionBean> action;
                private List<EmotionBean> emotion;
                private List<OperationBean> operation;
                private List<OtherBean> other;

                public List<ActionBean> getAction() {
                    return action;
                }

                public void setAction(List<ActionBean> action) {
                    this.action = action;
                }

                public List<EmotionBean> getEmotion() {
                    return emotion;
                }

                public void setEmotion(List<EmotionBean> emotion) {
                    this.emotion = emotion;
                }

                public List<OperationBean> getOperation() {
                    return operation;
                }

                public void setOperation(List<OperationBean> operation) {
                    this.operation = operation;
                }

                public List<OtherBean> getOther() {
                    return other;
                }

                public void setOther(List<OtherBean> other) {
                    this.other = other;
                }

                public static class ActionBean {
                    /**
                     * icon_ios : http://b.hiphotos.baidu.com/ting/pic/item/94cad1c8a786c917cd5a64c9cf3d70cf3ac757e0.jpg
                     * scene_name : 在路上
                     * bgpic_android :
                     * icon_android : http://c.hiphotos.baidu.com/ting/pic/item/b999a9014c086e06604a914805087bf40bd1cbd7.jpg
                     * scene_model : 2
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 0
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class EmotionBean {
                    /**
                     * icon_ios : http://c.hiphotos.baidu.com/ting/pic/item/f3d3572c11dfa9ec87c175e764d0f703908fc156.jpg
                     * scene_name : 悲伤
                     * bgpic_android :
                     * icon_android : http://a.hiphotos.baidu.com/ting/pic/item/d058ccbf6c81800ae39f160db63533fa828b47bf.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 36
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class OperationBean {
                    /**
                     * icon_ios : http://b.hiphotos.baidu.com/ting/pic/item/18d8bc3eb13533faf2ba9fa3aed3fd1f41345b2a.jpg
                     * scene_name : 网络歌曲
                     * bgpic_android :
                     * icon_android : http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7ca73313874f51fbe096a63a9e8.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 156
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class OtherBean {
                    /**
                     * icon_ios : http://c.hiphotos.baidu.com/ting/pic/item/b3b7d0a20cf431ad9bb26ac94d36acaf2fdd98d9.jpg
                     * scene_name : 流行
                     * bgpic_android :
                     * icon_android : http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab6443ffd5c3f036afc379311e27.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 48
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }
            }

            public static class ConfigBean {
                /**
                 * color_other :
                 * play_color :
                 * scene_version : 0
                 * desc :
                 * end_time : 0
                 * start_time : 0
                 * scene_color :
                 * bgpic :
                 * bgpic_special :
                 * button_color :
                 */

                private String color_other;
                private String play_color;
                private int scene_version;
                private String desc;
                private int end_time;
                private int start_time;
                private String scene_color;
                private String bgpic;
                private String bgpic_special;
                private String button_color;

                public String getColor_other() {
                    return color_other;
                }

                public void setColor_other(String color_other) {
                    this.color_other = color_other;
                }

                public String getPlay_color() {
                    return play_color;
                }

                public void setPlay_color(String play_color) {
                    this.play_color = play_color;
                }

                public int getScene_version() {
                    return scene_version;
                }

                public void setScene_version(int scene_version) {
                    this.scene_version = scene_version;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getEnd_time() {
                    return end_time;
                }

                public void setEnd_time(int end_time) {
                    this.end_time = end_time;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public String getScene_color() {
                    return scene_color;
                }

                public void setScene_color(String scene_color) {
                    this.scene_color = scene_color;
                }

                public String getBgpic() {
                    return bgpic;
                }

                public void setBgpic(String bgpic) {
                    this.bgpic = bgpic;
                }

                public String getBgpic_special() {
                    return bgpic_special;
                }

                public void setBgpic_special(String bgpic_special) {
                    this.bgpic_special = bgpic_special;
                }

                public String getButton_color() {
                    return button_color;
                }

                public void setButton_color(String button_color) {
                    this.button_color = button_color;
                }
            }
        }

        public static class DiyBean {
            /**
             * error_code : 22000
             * result : [{"position":1,"tag":"欧美,电子","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/89509755bf17cd45609d168379e4f2d9.jpg","title":"Young Turks|梦幻独立电子乐","collectnum":62,"type":"gedan","listenum":6452,"listid":"378319149"},{"position":2,"tag":"电子,兴奋,游戏","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/d11058d3f61a09000f6f9686eb40a44f.jpg","title":"【游戏BGM】燃炸天际，五杀不是梦","collectnum":46,"type":"gedan","listenum":5770,"listid":"402910101"},{"position":3,"tag":"ACG,电子","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/540fea0af85ba014e8f50106494a8e77.jpg","title":"【突破次元】洛天依の音乐游乐场","collectnum":1,"type":"gedan","listenum":29,"listid":"481821365"},{"position":4,"tag":"民族,安静","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/5f334b8e3bc5e145d9e13cb0d4348919.jpg","title":"江南乡音，呢哝软语杨柳依","collectnum":28,"type":"gedan","listenum":5313,"listid":"402702341"},{"position":5,"tag":"日语,ACG,游戏","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/5bd3955719873d08d0d44f69009f6d1f.jpg","title":"【突破次元】经典日式剧情游戏用曲","collectnum":1,"type":"gedan","listenum":8,"listid":"481809952"},{"position":6,"tag":"小语种,说唱","songidlist":[],"pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/36a4358bbc514a565324c8530816607d.jpg","title":"【多语种说唱】不一样的嘻哈范","collectnum":4,"type":"gedan","listenum":1160,"listid":"401442402"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXXX {
                /**
                 * position : 1
                 * tag : 欧美,电子
                 * songidlist : []
                 * pic : http://musicugc.cdn.qianqian.com/ugcdiy/pic/89509755bf17cd45609d168379e4f2d9.jpg
                 * title : Young Turks|梦幻独立电子乐
                 * collectnum : 62
                 * type : gedan
                 * listenum : 6452
                 * listid : 378319149
                 */

                private int position;
                private String tag;
                private String pic;
                private String title;
                private int collectnum;
                private String type;
                private int listenum;
                private String listid;
                private List<?> songidlist;

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }

                public String getTag() {
                    return tag;
                }

                public void setTag(String tag) {
                    this.tag = tag;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getCollectnum() {
                    return collectnum;
                }

                public void setCollectnum(int collectnum) {
                    this.collectnum = collectnum;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getListenum() {
                    return listenum;
                }

                public void setListenum(int listenum) {
                    this.listenum = listenum;
                }

                public String getListid() {
                    return listid;
                }

                public void setListid(String listid) {
                    this.listid = listid;
                }

                public List<?> getSongidlist() {
                    return songidlist;
                }

                public void setSongidlist(List<?> songidlist) {
                    this.songidlist = songidlist;
                }
            }
        }

        public static class KingBean {
            /**
             * error_code : 22000
             * result : [{"pic_big":"http://musicdata.baidu.com/data2/pic/eb3bb619bdf02ab57cc86a47187af013/541463581/541463581.jpg@s_0,w_150","title":"敢爱就来","author":"冯建宇"},{"pic_big":"http://musicdata.baidu.com/data2/pic/0f1f232f9e6f921a595c1e4a076473c2/542052591/542052591.jpg@s_0,w_150","title":"上海LOCKING","author":"十二星宿风之少年"},{"pic_big":"http://musicdata.baidu.com/data2/pic/9d4faa13282c9d6beea41f479448f259/540090993/540090993.jpg@s_0,w_150","title":"拿不走的记忆","author":"迪玛希"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXXXX {
                /**
                 * pic_big : http://musicdata.baidu.com/data2/pic/eb3bb619bdf02ab57cc86a47187af013/541463581/541463581.jpg@s_0,w_150
                 * title : 敢爱就来
                 * author : 冯建宇
                 */

                private String pic_big;
                private String title;
                private String author;

                public String getPic_big() {
                    return pic_big;
                }

                public void setPic_big(String pic_big) {
                    this.pic_big = pic_big;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }
    }

    public static class ModuleBean {
        /**
         * id : 25
         * style : 1
         * link_url :
         * style_nums : 0
         * pos : 1
         * title : 焦点图
         * key : focus
         * picurl :
         * title_more :
         * nums : 8
         * jump :
         */

        private String id;
        private int style;
        private String link_url;
        private String style_nums;
        private int pos;
        private String title;
        private String key;
        private String picurl;
        private String title_more;
        private int nums;
        private String jump;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getStyle() {
            return style;
        }

        public void setStyle(int style) {
            this.style = style;
        }

        public String getLink_url() {
            return link_url;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public String getStyle_nums() {
            return style_nums;
        }

        public void setStyle_nums(String style_nums) {
            this.style_nums = style_nums;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getTitle_more() {
            return title_more;
        }

        public void setTitle_more(String title_more) {
            this.title_more = title_more;
        }

        public int getNums() {
            return nums;
        }

        public void setNums(int nums) {
            this.nums = nums;
        }

        public String getJump() {
            return jump;
        }

        public void setJump(String jump) {
            this.jump = jump;
        }
    }
}
