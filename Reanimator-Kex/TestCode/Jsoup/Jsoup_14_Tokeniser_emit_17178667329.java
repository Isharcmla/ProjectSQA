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
import java.lang.Character;

public class Tokeniser_emit_17178667329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10575;
     Object term10822;

    public Tokeniser_emit_17178667329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76946 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term76945 = ((Class) term76946).getDeclaredField((String) "ScriptData");
        ((Field) term76945).setAccessible(true);
        Object enum312 = ((Field) term76945).get((Object) null);
        Class<? extends Object> term77138 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77137 = ((Class) term77138).getDeclaredField((String) "BeforeHtml");
        ((Field) term77137).setAccessible(true);
        Object enum313 = ((Field) term77137).get((Object) null);
        Object term10595 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term10595, term10595.getClass(), "errorMsg", "");
        setIntField(term10595, term10595.getClass(), "pos", 1193880199);
        setCharField(term10595, term10595.getClass(), "c", 'E');
        setField(term10595, term10595.getClass(), "tokeniserState", enum312);
        setField(term10595, term10595.getClass(), "treeBuilderState", enum313);
        setField(term10595, term10595.getClass(), "token", null);
        Class<? extends Object> term77340 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term77339 = ((Class) term77340).getDeclaredField((String) "Data");
        ((Field) term77339).setAccessible(true);
        Object enum314 = ((Field) term77339).get((Object) null);
        Class<? extends Object> term77514 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77513 = ((Class) term77514).getDeclaredField((String) "InColumnGroup");
        ((Field) term77513).setAccessible(true);
        Object enum315 = ((Field) term77513).get((Object) null);
        Object term10603 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term10603, term10603.getClass(), "errorMsg", "");
        setIntField(term10603, term10603.getClass(), "pos", -1087774327);
        setCharField(term10603, term10603.getClass(), "c", 't');
        setField(term10603, term10603.getClass(), "tokeniserState", enum314);
        setField(term10603, term10603.getClass(), "treeBuilderState", enum315);
        setField(term10603, term10603.getClass(), "token", null);
        ArrayList term10593 = new ArrayList();
        ((ArrayList) term10593).add(term10595);
        ((ArrayList) term10593).add(term10603);
        Class<? extends Object> term77725 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term77724 = ((Class) term77725).getDeclaredField((String) "TagOpen");
        ((Field) term77724).setAccessible(true);
        Object enum316 = ((Field) term77724).get((Object) null);
        Class<? extends Object> term77988 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term77987 = ((Class) term77988).getDeclaredField((String) "Doctype");
        ((Field) term77987).setAccessible(true);
        Object enum317 = ((Field) term77987).get((Object) null);
        Class<? extends Object> term78192 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term78191 = ((Class) term78192).getDeclaredField((String) "Comment");
        ((Field) term78191).setAccessible(true);
        Object enum318 = ((Field) term78191).get((Object) null);
        Class<? extends Object> term78410 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term78409 = ((Class) term78410).getDeclaredField((String) "StartTag");
        ((Field) term78409).setAccessible(true);
        Object enum319 = ((Field) term78409).get((Object) null);
        term10575 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term10576 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term10625 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10626 = (byte[]) newByteArray(16);
        Object term10645 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10646 = (byte[]) newByteArray(16);
        Object term10665 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term10666 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10667 = (byte[]) newByteArray(16);
        Object term10686 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10687 = (byte[]) newByteArray(16);
        Object term10706 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10707 = (byte[]) newByteArray(16);
        Object term10738 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term10739 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10740 = (byte[]) newByteArray(16);
        Object term10770 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term10808 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10576, term10576.getClass(), "input", "flxyYxBRtu");
        setIntField(term10576, term10576.getClass(), "length", -1179120542);
        setIntField(term10576, term10576.getClass(), "pos", -73683645);
        setIntField(term10576, term10576.getClass(), "mark", -226514366);
        setField(term10575, term10575.getClass(), "reader", term10576);
        setBooleanField(term10575, term10575.getClass(), "trackErrors", true);
        setField(term10575, term10575.getClass(), "errors", term10593);
        setField(term10575, term10575.getClass(), "state", enum316);
        setField(term10575, term10575.getClass(), "emitPending", null);
        setBooleanField(term10575, term10575.getClass(), "isEmitPending", false);
        setField(term10625, term10625.getClass(), "value", term10626);
        setByteField(term10625, term10625.getClass(), "coder", (byte) 18);
        setIntField(term10625, term10625.getClass(), "count", -1530420153);
        setField(term10575, term10575.getClass(), "charBuffer", term10625);
        setField(term10645, term10645.getClass(), "value", term10646);
        setByteField(term10645, term10645.getClass(), "coder", (byte) -58);
        setIntField(term10645, term10645.getClass(), "count", -469968304);
        setField(term10575, term10575.getClass(), "dataBuffer", term10645);
        setField(term10575, term10575.getClass(), "tagPending", null);
        setField(term10666, term10666.getClass(), "value", term10667);
        setByteField(term10666, term10666.getClass(), "coder", (byte) 0);
        setIntField(term10666, term10666.getClass(), "count", 0);
        setField(term10665, term10665.getClass(), "name", term10666);
        setField(term10686, term10686.getClass(), "value", term10687);
        setByteField(term10686, term10686.getClass(), "coder", (byte) 0);
        setIntField(term10686, term10686.getClass(), "count", 0);
        setField(term10665, term10665.getClass(), "publicIdentifier", term10686);
        setField(term10706, term10706.getClass(), "value", term10707);
        setByteField(term10706, term10706.getClass(), "coder", (byte) 0);
        setIntField(term10706, term10706.getClass(), "count", 0);
        setField(term10665, term10665.getClass(), "systemIdentifier", term10706);
        setBooleanField(term10665, term10665.getClass(), "forceQuirks", true);
        setField(term10665, term10665.getClass(), "type", enum317);
        setField(term10575, term10575.getClass(), "doctypePending", term10665);
        setField(term10739, term10739.getClass(), "value", term10740);
        setByteField(term10739, term10739.getClass(), "coder", (byte) 0);
        setIntField(term10739, term10739.getClass(), "count", 0);
        setField(term10738, term10738.getClass(), "data", term10739);
        setField(term10738, term10738.getClass(), "type", enum318);
        setField(term10575, term10575.getClass(), "commentPending", term10738);
        setField(term10770, term10770.getClass(), "tagName", "TEParAifyi");
        setField(term10770, term10770.getClass(), "pendingAttributeName", "OWDIEULEFu");
        setField(term10770, term10770.getClass(), "pendingAttributeValue", "dWRymuLBtr");
        setBooleanField(term10770, term10770.getClass(), "selfClosing", false);
        setField(term10808, term10808.getClass(), "attributes", null);
        setField(term10770, term10770.getClass(), "attributes", term10808);
        setField(term10770, term10770.getClass(), "type", enum319);
        setField(term10575, term10575.getClass(), "lastStartTag", term10770);
        setBooleanField(term10575, term10575.getClass(), "selfClosingFlagAcknowledged", false);
        term10822 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term10822;
        try {
            callMethod(klass, "emit", argTypes, term10575, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


