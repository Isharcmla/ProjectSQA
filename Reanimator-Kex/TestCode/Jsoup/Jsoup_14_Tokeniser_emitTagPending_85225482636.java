package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_emitTagPending_85225482636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28141;

    public Tokeniser_emitTagPending_85225482636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108011 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term108010 = ((Class) term108011).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term108010).setAccessible(true);
        Object enum445 = ((Field) term108010).get((Object) null);
        Class<? extends Object> term108388 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term108387 = ((Class) term108388).getDeclaredField((String) "AfterAfterBody");
        ((Field) term108387).setAccessible(true);
        Object enum446 = ((Field) term108387).get((Object) null);
        Object term28161 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28161, term28161.getClass(), "errorMsg", "");
        setIntField(term28161, term28161.getClass(), "pos", -1845499264);
        setCharField(term28161, term28161.getClass(), "c", 'J');
        setField(term28161, term28161.getClass(), "tokeniserState", enum445);
        setField(term28161, term28161.getClass(), "treeBuilderState", enum446);
        setField(term28161, term28161.getClass(), "token", null);
        Class<? extends Object> term108762 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term108759 = ((Class) term108762).getDeclaredField((String) "AfterBody");
        ((Field) term108759).setAccessible(true);
        Object enum448 = ((Field) term108759).get((Object) null);
        Object term28169 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28169, term28169.getClass(), "errorMsg", "");
        setIntField(term28169, term28169.getClass(), "pos", -505439934);
        setCharField(term28169, term28169.getClass(), "c", 'C');
        setField(term28169, term28169.getClass(), "tokeniserState", enum445);
        setField(term28169, term28169.getClass(), "treeBuilderState", enum448);
        setField(term28169, term28169.getClass(), "token", null);
        Class<? extends Object> term109091 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term109090 = ((Class) term109091).getDeclaredField((String) "ScriptDataEscapedLessthanSign");
        ((Field) term109090).setAccessible(true);
        Object enum450 = ((Field) term109090).get((Object) null);
        Class<? extends Object> term109414 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term109413 = ((Class) term109414).getDeclaredField((String) "InHeadNoscript");
        ((Field) term109413).setAccessible(true);
        Object enum451 = ((Field) term109413).get((Object) null);
        Object term28175 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28175, term28175.getClass(), "errorMsg", "");
        setIntField(term28175, term28175.getClass(), "pos", -344842608);
        setCharField(term28175, term28175.getClass(), "c", 'Z');
        setField(term28175, term28175.getClass(), "tokeniserState", enum450);
        setField(term28175, term28175.getClass(), "treeBuilderState", enum451);
        setField(term28175, term28175.getClass(), "token", null);
        Class<? extends Object> term109628 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term109627 = ((Class) term109628).getDeclaredField((String) "Comment");
        ((Field) term109627).setAccessible(true);
        Object enum452 = ((Field) term109627).get((Object) null);
        Class<? extends Object> term109811 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term109810 = ((Class) term109811).getDeclaredField((String) "InColumnGroup");
        ((Field) term109810).setAccessible(true);
        Object enum453 = ((Field) term109810).get((Object) null);
        Object term28183 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28183, term28183.getClass(), "errorMsg", "");
        setIntField(term28183, term28183.getClass(), "pos", 941650513);
        setCharField(term28183, term28183.getClass(), "c", 'p');
        setField(term28183, term28183.getClass(), "tokeniserState", enum452);
        setField(term28183, term28183.getClass(), "treeBuilderState", enum453);
        setField(term28183, term28183.getClass(), "token", null);
        Class<? extends Object> term110022 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term110021 = ((Class) term110022).getDeclaredField((String) "CommentEndBang");
        ((Field) term110021).setAccessible(true);
        Object enum454 = ((Field) term110021).get((Object) null);
        Class<? extends Object> term110226 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term110225 = ((Class) term110226).getDeclaredField((String) "InSelect");
        ((Field) term110225).setAccessible(true);
        Object enum455 = ((Field) term110225).get((Object) null);
        Object term28191 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28191, term28191.getClass(), "errorMsg", "");
        setIntField(term28191, term28191.getClass(), "pos", 444029505);
        setCharField(term28191, term28191.getClass(), "c", 'V');
        setField(term28191, term28191.getClass(), "tokeniserState", enum454);
        setField(term28191, term28191.getClass(), "treeBuilderState", enum455);
        setField(term28191, term28191.getClass(), "token", null);
        Class<? extends Object> term110422 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term110421 = ((Class) term110422).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term110421).setAccessible(true);
        Object enum456 = ((Field) term110421).get((Object) null);
        Class<? extends Object> term110641 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term110640 = ((Class) term110641).getDeclaredField((String) "AfterFrameset");
        ((Field) term110640).setAccessible(true);
        Object enum457 = ((Field) term110640).get((Object) null);
        Object term28199 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28199, term28199.getClass(), "errorMsg", "");
        setIntField(term28199, term28199.getClass(), "pos", -1034506028);
        setCharField(term28199, term28199.getClass(), "c", 'm');
        setField(term28199, term28199.getClass(), "tokeniserState", enum456);
        setField(term28199, term28199.getClass(), "treeBuilderState", enum457);
        setField(term28199, term28199.getClass(), "token", null);
        Class<? extends Object> term110852 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term110851 = ((Class) term110852).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term110851).setAccessible(true);
        Object enum458 = ((Field) term110851).get((Object) null);
        Class<? extends Object> term111092 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term111091 = ((Class) term111092).getDeclaredField((String) "InCell");
        ((Field) term111091).setAccessible(true);
        Object enum459 = ((Field) term111091).get((Object) null);
        Object term28207 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term28207, term28207.getClass(), "errorMsg", "");
        setIntField(term28207, term28207.getClass(), "pos", -1263114719);
        setCharField(term28207, term28207.getClass(), "c", 'a');
        setField(term28207, term28207.getClass(), "tokeniserState", enum458);
        setField(term28207, term28207.getClass(), "treeBuilderState", enum459);
        setField(term28207, term28207.getClass(), "token", null);
        ArrayList term28159 = new ArrayList();
        ((ArrayList) term28159).add(term28161);
        ((ArrayList) term28159).add(term28169);
        ((ArrayList) term28159).add(term28175);
        ((ArrayList) term28159).add(term28183);
        ((ArrayList) term28159).add(term28191);
        ((ArrayList) term28159).add(term28199);
        ((ArrayList) term28159).add(term28207);
        Class<? extends Object> term111282 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term111281 = ((Class) term111282).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term111281).setAccessible(true);
        Object enum460 = ((Field) term111281).get((Object) null);
        Class<? extends Object> term111578 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111577 = ((Class) term111578).getDeclaredField((String) "Doctype");
        ((Field) term111577).setAccessible(true);
        Object enum461 = ((Field) term111577).get((Object) null);
        Class<? extends Object> term111782 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111781 = ((Class) term111782).getDeclaredField((String) "Comment");
        ((Field) term111781).setAccessible(true);
        Object enum462 = ((Field) term111781).get((Object) null);
        Class<? extends Object> term111970 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111969 = ((Class) term111970).getDeclaredField((String) "StartTag");
        ((Field) term111969).setAccessible(true);
        Object enum463 = ((Field) term111969).get((Object) null);
        term28141 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term28142 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term28240 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28241 = (byte[]) newByteArray(16);
        Object term28260 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28261 = (byte[]) newByteArray(16);
        Object term28280 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term28281 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28282 = (byte[]) newByteArray(16);
        Object term28301 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28302 = (byte[]) newByteArray(16);
        Object term28321 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28322 = (byte[]) newByteArray(16);
        Object term28353 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term28354 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term28355 = (byte[]) newByteArray(16);
        Object term28385 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term28387 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28142, term28142.getClass(), "input", "MAcUBcBckh");
        setIntField(term28142, term28142.getClass(), "length", 1114000454);
        setIntField(term28142, term28142.getClass(), "pos", -556405712);
        setIntField(term28142, term28142.getClass(), "mark", -1772434990);
        setField(term28141, term28141.getClass(), "reader", term28142);
        setBooleanField(term28141, term28141.getClass(), "trackErrors", true);
        setField(term28141, term28141.getClass(), "errors", term28159);
        setField(term28141, term28141.getClass(), "state", enum460);
        setField(term28141, term28141.getClass(), "emitPending", null);
        setBooleanField(term28141, term28141.getClass(), "isEmitPending", true);
        setField(term28240, term28240.getClass(), "value", term28241);
        setByteField(term28240, term28240.getClass(), "coder", (byte) -54);
        setIntField(term28240, term28240.getClass(), "count", -894662986);
        setField(term28141, term28141.getClass(), "charBuffer", term28240);
        setField(term28260, term28260.getClass(), "value", term28261);
        setByteField(term28260, term28260.getClass(), "coder", (byte) 67);
        setIntField(term28260, term28260.getClass(), "count", 304775596);
        setField(term28141, term28141.getClass(), "dataBuffer", term28260);
        setField(term28141, term28141.getClass(), "tagPending", null);
        setField(term28281, term28281.getClass(), "value", term28282);
        setByteField(term28281, term28281.getClass(), "coder", (byte) 0);
        setIntField(term28281, term28281.getClass(), "count", 0);
        setField(term28280, term28280.getClass(), "name", term28281);
        setField(term28301, term28301.getClass(), "value", term28302);
        setByteField(term28301, term28301.getClass(), "coder", (byte) 0);
        setIntField(term28301, term28301.getClass(), "count", 0);
        setField(term28280, term28280.getClass(), "publicIdentifier", term28301);
        setField(term28321, term28321.getClass(), "value", term28322);
        setByteField(term28321, term28321.getClass(), "coder", (byte) 0);
        setIntField(term28321, term28321.getClass(), "count", 0);
        setField(term28280, term28280.getClass(), "systemIdentifier", term28321);
        setBooleanField(term28280, term28280.getClass(), "forceQuirks", false);
        setField(term28280, term28280.getClass(), "type", enum461);
        setField(term28141, term28141.getClass(), "doctypePending", term28280);
        setField(term28354, term28354.getClass(), "value", term28355);
        setByteField(term28354, term28354.getClass(), "coder", (byte) 0);
        setIntField(term28354, term28354.getClass(), "count", 0);
        setField(term28353, term28353.getClass(), "data", term28354);
        setField(term28353, term28353.getClass(), "type", enum462);
        setField(term28141, term28141.getClass(), "commentPending", term28353);
        setField(term28385, term28385.getClass(), "tagName", null);
        setField(term28385, term28385.getClass(), "pendingAttributeName", null);
        setField(term28385, term28385.getClass(), "pendingAttributeValue", null);
        setBooleanField(term28385, term28385.getClass(), "selfClosing", false);
        setField(term28387, term28387.getClass(), "attributes", null);
        setField(term28385, term28385.getClass(), "attributes", term28387);
        setField(term28385, term28385.getClass(), "type", enum463);
        setField(term28141, term28141.getClass(), "lastStartTag", term28385);
        setBooleanField(term28141, term28141.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term28141, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


