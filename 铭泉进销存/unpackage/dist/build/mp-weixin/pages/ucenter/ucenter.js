(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/ucenter/ucenter"],{"049e":function(t,e,n){"use strict";var o=n("e330"),u=n.n(o);u.a},"1aee":function(t,e,n){"use strict";(function(t){n("c0fa");o(n("66fd"));var e=o(n("e128"));function o(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,n("543d")["createPage"])},"381e":function(t,e,n){"use strict";n.r(e);var o=n("f747"),u=n.n(o);for(var i in o)"default"!==i&&function(t){n.d(e,t,(function(){return o[t]}))}(i);e["default"]=u.a},4055:function(t,e,n){"use strict";var o;n.d(e,"b",(function(){return u})),n.d(e,"c",(function(){return i})),n.d(e,"a",(function(){return o}));var u=function(){var t=this,e=t.$createElement,o=(t._self._c,n("3fad")),u=n("7a47"),i=n("0a4f");t.$mp.data=Object.assign({},{$root:{m0:o,m1:u,m2:i}})},i=[]},e128:function(t,e,n){"use strict";n.r(e);var o=n("4055"),u=n("381e");for(var i in u)"default"!==i&&function(t){n.d(e,t,(function(){return u[t]}))}(i);n("049e");var c,a=n("f0c5"),s=Object(a["a"])(u["default"],o["b"],o["c"],!1,null,null,null,!1,o["a"],c);e["default"]=s.exports},e330:function(t,e,n){},f747:function(t,e,n){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var o=n("23f5"),u=n("9e22"),i=function(){Promise.all([n.e("common/vendor"),n.e("components/tki-qrcode/tki-qrcode")]).then(function(){return resolve(n("6aed"))}.bind(null,n)).catch(n.oe)},c={components:{tkiQrcode:i},data:function(){return{userinfo:"",avatar:"../../static/toux.jpg",version:"",src:"",foreground:"#000000",pdground:"#66ccff",background:"#ffffff",shequ:{},type:0,val:""}},onLoad:function(){this.islogin()?(this.userinfo=t.getStorageSync("user"),console.log(this.userinfo)):console.log("未登录"),this.version=o.version,this.shequ=t.getStorageSync("shequ"),this.type=t.getStorageSync("type"),this.val="https://www.zgnnet.com/aliapp/shequ?id="+t.getStorageSync("shequ").shequ_id},methods:{qrR:function(t){this.src=t},setting:function(){this.islogin()&&t.navigateTo({url:"/pages/infomation/infomation"})},SelectShequ:function(){t.$once("shequ_select",(function(e){var n=this;1===e.type&&post(that.ali_app+"today_data",{id:e.shequ_id,type:3}).then((function(e){t.setStorageSync("shequ",e.data.shequ),n.shequ=e.data.shequ}))})),t.navigateTo({url:"../index/shequ_list/shequ_list"})},logout:function(){var e=this;t.showModal({title:"提示",content:"确定要退出登录？",success:function(n){n.confirm?u.post({url:"user/public/logout",method:"POST",success:function(n){t.clearStorageSync(),e.userinfo="",t.reLaunch({url:"../login/login"})}}):n.cancel}})}}};e.default=c}).call(this,n("543d")["default"])}},[["1aee","common/runtime","common/vendor"]]]);