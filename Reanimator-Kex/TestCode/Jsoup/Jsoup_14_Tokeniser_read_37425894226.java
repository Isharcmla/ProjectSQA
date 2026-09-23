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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_read_37425894226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public Tokeniser_read_37425894226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68095 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term68094 = ((Class) term68095).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term68094).setAccessible(true);
        Object enum275 = ((Field) term68094).get((Object) null);
        Class<? extends Object> term68314 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68313 = ((Class) term68314).getDeclaredField((String) "InTableText");
        ((Field) term68313).setAccessible(true);
        Object enum276 = ((Field) term68313).get((Object) null);
        Object term47 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term47, term47.getClass(), "errorMsg", "");
        setIntField(term47, term47.getClass(), "pos", -1955890973);
        setCharField(term47, term47.getClass(), "c", 'P');
        setField(term47, term47.getClass(), "tokeniserState", enum275);
        setField(term47, term47.getClass(), "treeBuilderState", enum276);
        setField(term47, term47.getClass(), "token", null);
        Class<? extends Object> term68519 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term68518 = ((Class) term68519).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term68518).setAccessible(true);
        Object enum277 = ((Field) term68518).get((Object) null);
        Class<? extends Object> term68729 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68728 = ((Class) term68729).getDeclaredField((String) "Text");
        ((Field) term68728).setAccessible(true);
        Object enum278 = ((Field) term68728).get((Object) null);
        Object term55 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term55, term55.getClass(), "errorMsg", "");
        setIntField(term55, term55.getClass(), "pos", -2038273078);
        setCharField(term55, term55.getClass(), "c", 'A');
        setField(term55, term55.getClass(), "tokeniserState", enum277);
        setField(term55, term55.getClass(), "treeBuilderState", enum278);
        setField(term55, term55.getClass(), "token", null);
        Class<? extends Object> term68913 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term68912 = ((Class) term68913).getDeclaredField((String) "AttributeName");
        ((Field) term68912).setAccessible(true);
        Object enum279 = ((Field) term68912).get((Object) null);
        Class<? extends Object> term69114 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69113 = ((Class) term69114).getDeclaredField((String) "InFrameset");
        ((Field) term69113).setAccessible(true);
        Object enum280 = ((Field) term69113).get((Object) null);
        Object term63 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term63, term63.getClass(), "errorMsg", "");
        setIntField(term63, term63.getClass(), "pos", 1227103734);
        setCharField(term63, term63.getClass(), "c", 'E');
        setField(term63, term63.getClass(), "tokeniserState", enum279);
        setField(term63, term63.getClass(), "treeBuilderState", enum280);
        setField(term63, term63.getClass(), "token", null);
        Class<? extends Object> term69316 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69315 = ((Class) term69316).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term69315).setAccessible(true);
        Object enum281 = ((Field) term69315).get((Object) null);
        Object term71 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term71, term71.getClass(), "errorMsg", "");
        setIntField(term71, term71.getClass(), "pos", -1339778481);
        setCharField(term71, term71.getClass(), "c", 'B');
        setField(term71, term71.getClass(), "tokeniserState", enum279);
        setField(term71, term71.getClass(), "treeBuilderState", enum281);
        setField(term71, term71.getClass(), "token", null);
        Class<? extends Object> term69542 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term69541 = ((Class) term69542).getDeclaredField((String) "AfterAttributeName");
        ((Field) term69541).setAccessible(true);
        Object enum282 = ((Field) term69541).get((Object) null);
        Class<? extends Object> term69758 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69757 = ((Class) term69758).getDeclaredField((String) "InColumnGroup");
        ((Field) term69757).setAccessible(true);
        Object enum283 = ((Field) term69757).get((Object) null);
        Object term77 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term77, term77.getClass(), "errorMsg", "");
        setIntField(term77, term77.getClass(), "pos", 1725571209);
        setCharField(term77, term77.getClass(), "c", 't');
        setField(term77, term77.getClass(), "tokeniserState", enum282);
        setField(term77, term77.getClass(), "treeBuilderState", enum283);
        setField(term77, term77.getClass(), "token", null);
        ArrayList term45 = new ArrayList();
        ((ArrayList) term45).add(term47);
        ((ArrayList) term45).add(term55);
        ((ArrayList) term45).add(term63);
        ((ArrayList) term45).add(term71);
        ((ArrayList) term45).add(term77);
        Class<? extends Object> term69969 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term69968 = ((Class) term69969).getDeclaredField((String) "AfterDoctypePublicKeyword");
        ((Field) term69968).setAccessible(true);
        Object enum284 = ((Field) term69968).get((Object) null);
        Class<? extends Object> term70286 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term70285 = ((Class) term70286).getDeclaredField((String) "Doctype");
        ((Field) term70285).setAccessible(true);
        Object enum285 = ((Field) term70285).get((Object) null);
        Class<? extends Object> term70490 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term70489 = ((Class) term70490).getDeclaredField((String) "Comment");
        ((Field) term70489).setAccessible(true);
        Object enum286 = ((Field) term70489).get((Object) null);
        Class<? extends Object> term70708 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term70707 = ((Class) term70708).getDeclaredField((String) "StartTag");
        ((Field) term70707).setAccessible(true);
        Object enum287 = ((Field) term70707).get((Object) null);
        term27 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term28 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term117 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term118 = (byte[]) newByteArray(16);
        Object term137 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term138 = (byte[]) newByteArray(16);
        Object term157 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term158 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term159 = (byte[]) newByteArray(16);
        Object term178 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179 = (byte[]) newByteArray(16);
        Object term198 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term199 = (byte[]) newByteArray(16);
        Object term230 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term231 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term232 = (byte[]) newByteArray(16);
        Object term262 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28, term28.getClass(), "input", "sjlJAEtRrb");
        setIntField(term28, term28.getClass(), "length", 391863371);
        setIntField(term28, term28.getClass(), "pos", -1922583790);
        setIntField(term28, term28.getClass(), "mark", -616727354);
        setField(term27, term27.getClass(), "reader", term28);
        setBooleanField(term27, term27.getClass(), "trackErrors", false);
        setField(term27, term27.getClass(), "errors", term45);
        setField(term27, term27.getClass(), "state", enum284);
        setField(term27, term27.getClass(), "emitPending", null);
        setBooleanField(term27, term27.getClass(), "isEmitPending", false);
        setField(term117, term117.getClass(), "value", term118);
        setByteField(term117, term117.getClass(), "coder", (byte) 47);
        setIntField(term117, term117.getClass(), "count", -522618178);
        setField(term27, term27.getClass(), "charBuffer", term117);
        setField(term137, term137.getClass(), "value", term138);
        setByteField(term137, term137.getClass(), "coder", (byte) 48);
        setIntField(term137, term137.getClass(), "count", 1134449235);
        setField(term27, term27.getClass(), "dataBuffer", term137);
        setField(term27, term27.getClass(), "tagPending", null);
        setField(term158, term158.getClass(), "value", term159);
        setByteField(term158, term158.getClass(), "coder", (byte) 0);
        setIntField(term158, term158.getClass(), "count", 0);
        setField(term157, term157.getClass(), "name", term158);
        setField(term178, term178.getClass(), "value", term179);
        setByteField(term178, term178.getClass(), "coder", (byte) 0);
        setIntField(term178, term178.getClass(), "count", 0);
        setField(term157, term157.getClass(), "publicIdentifier", term178);
        setField(term198, term198.getClass(), "value", term199);
        setByteField(term198, term198.getClass(), "coder", (byte) 0);
        setIntField(term198, term198.getClass(), "count", 0);
        setField(term157, term157.getClass(), "systemIdentifier", term198);
        setBooleanField(term157, term157.getClass(), "forceQuirks", false);
        setField(term157, term157.getClass(), "type", enum285);
        setField(term27, term27.getClass(), "doctypePending", term157);
        setField(term231, term231.getClass(), "value", term232);
        setByteField(term231, term231.getClass(), "coder", (byte) 0);
        setIntField(term231, term231.getClass(), "count", 0);
        setField(term230, term230.getClass(), "data", term231);
        setField(term230, term230.getClass(), "type", enum286);
        setField(term27, term27.getClass(), "commentPending", term230);
        setField(term262, term262.getClass(), "tagName", "MjGYSRKTNF");
        setField(term262, term262.getClass(), "pendingAttributeName", "hRNSzYYIrc");
        setField(term262, term262.getClass(), "pendingAttributeValue", "RMFIsYGgne");
        setBooleanField(term262, term262.getClass(), "selfClosing", false);
        setField(term300, term300.getClass(), "attributes", null);
        setField(term262, term262.getClass(), "attributes", term300);
        setField(term262, term262.getClass(), "type", enum287);
        setField(term27, term27.getClass(), "lastStartTag", term262);
        setBooleanField(term27, term27.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term27, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


