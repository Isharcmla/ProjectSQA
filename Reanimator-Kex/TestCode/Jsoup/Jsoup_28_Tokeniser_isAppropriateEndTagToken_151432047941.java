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
import java.lang.String;

public class Tokeniser_isAppropriateEndTagToken_151432047941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20683;

    public Tokeniser_isAppropriateEndTagToken_151432047941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61254 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term61253 = ((Class) term61254).getDeclaredField((String) "ScriptData");
        ((Field) term61253).setAccessible(true);
        Object enum212 = ((Field) term61253).get((Object) null);
        Class<? extends Object> term61526 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term61525 = ((Class) term61526).getDeclaredField((String) "Doctype");
        ((Field) term61525).setAccessible(true);
        Object enum213 = ((Field) term61525).get((Object) null);
        Class<? extends Object> term61730 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term61729 = ((Class) term61730).getDeclaredField((String) "Comment");
        ((Field) term61729).setAccessible(true);
        Object enum214 = ((Field) term61729).get((Object) null);
        Class<? extends Object> term61954 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term61953 = ((Class) term61954).getDeclaredField((String) "StartTag");
        ((Field) term61953).setAccessible(true);
        Object enum215 = ((Field) term61953).get((Object) null);
        term20683 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term20684 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term20685 = (char[]) newCharArray(5);
        Object term20694 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term20713 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20714 = (byte[]) newByteArray(16);
        Object term20733 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20734 = (byte[]) newByteArray(16);
        Object term20753 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term20754 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20755 = (byte[]) newByteArray(16);
        Object term20774 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20775 = (byte[]) newByteArray(16);
        Object term20794 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20795 = (byte[]) newByteArray(16);
        Object term20826 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term20827 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20828 = (byte[]) newByteArray(16);
        Object term20858 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term20883 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20884 = (byte[]) newByteArray(16);
        Object term20904 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term20685, 0, 'O');
        setCharElement(term20685, 1, 'Q');
        setCharElement(term20685, 2, 'T');
        setCharElement(term20685, 3, 'y');
        setCharElement(term20685, 4, 'S');
        setField(term20684, term20684.getClass(), "input", term20685);
        setIntField(term20684, term20684.getClass(), "length", 304775596);
        setIntField(term20684, term20684.getClass(), "pos", -1347665717);
        setIntField(term20684, term20684.getClass(), "mark", -1888585309);
        setField(term20683, term20683.getClass(), "reader", term20684);
        setIntField(term20694, term20694.getClass(), "maxSize", 0);
        setField(term20694, term20694.getClass(), "elementData", null);
        setIntField(term20694, term20694.getClass(), "size", 0);
        setIntField(term20694, term20694.getClass(), "modCount", 0);
        setField(term20683, term20683.getClass(), "errors", term20694);
        setField(term20683, term20683.getClass(), "state", enum212);
        setField(term20683, term20683.getClass(), "emitPending", null);
        setBooleanField(term20683, term20683.getClass(), "isEmitPending", true);
        setField(term20713, term20713.getClass(), "value", term20714);
        setByteField(term20713, term20713.getClass(), "coder", (byte) -74);
        setIntField(term20713, term20713.getClass(), "count", 683666002);
        setField(term20683, term20683.getClass(), "charBuffer", term20713);
        setField(term20733, term20733.getClass(), "value", term20734);
        setByteField(term20733, term20733.getClass(), "coder", (byte) -123);
        setIntField(term20733, term20733.getClass(), "count", 1596213415);
        setField(term20683, term20683.getClass(), "dataBuffer", term20733);
        setField(term20683, term20683.getClass(), "tagPending", null);
        setField(term20754, term20754.getClass(), "value", term20755);
        setByteField(term20754, term20754.getClass(), "coder", (byte) 0);
        setIntField(term20754, term20754.getClass(), "count", 0);
        setField(term20753, term20753.getClass(), "name", term20754);
        setField(term20774, term20774.getClass(), "value", term20775);
        setByteField(term20774, term20774.getClass(), "coder", (byte) 0);
        setIntField(term20774, term20774.getClass(), "count", 0);
        setField(term20753, term20753.getClass(), "publicIdentifier", term20774);
        setField(term20794, term20794.getClass(), "value", term20795);
        setByteField(term20794, term20794.getClass(), "coder", (byte) 0);
        setIntField(term20794, term20794.getClass(), "count", 0);
        setField(term20753, term20753.getClass(), "systemIdentifier", term20794);
        setBooleanField(term20753, term20753.getClass(), "forceQuirks", true);
        setField(term20753, term20753.getClass(), "type", enum213);
        setField(term20683, term20683.getClass(), "doctypePending", term20753);
        setField(term20827, term20827.getClass(), "value", term20828);
        setByteField(term20827, term20827.getClass(), "coder", (byte) 0);
        setIntField(term20827, term20827.getClass(), "count", 0);
        setField(term20826, term20826.getClass(), "data", term20827);
        setField(term20826, term20826.getClass(), "type", enum214);
        setField(term20683, term20683.getClass(), "commentPending", term20826);
        setField(term20858, term20858.getClass(), "tagName", "SbAoxhfrkn");
        setField(term20858, term20858.getClass(), "pendingAttributeName", "kuTXqwMtDB");
        setField(term20883, term20883.getClass(), "value", term20884);
        setByteField(term20883, term20883.getClass(), "coder", (byte) -23);
        setIntField(term20883, term20883.getClass(), "count", -268815336);
        setField(term20858, term20858.getClass(), "pendingAttributeValue", term20883);
        setBooleanField(term20858, term20858.getClass(), "selfClosing", true);
        setField(term20904, term20904.getClass(), "attributes", null);
        setField(term20858, term20858.getClass(), "attributes", term20904);
        setField(term20858, term20858.getClass(), "type", enum215);
        setField(term20683, term20683.getClass(), "lastStartTag", term20858);
        setBooleanField(term20683, term20683.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term20683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


