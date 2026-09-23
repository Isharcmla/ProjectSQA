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

public class Tokeniser_emitTagPending_85225482635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13815;

    public Tokeniser_emitTagPending_85225482635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50374 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term50373 = ((Class) term50374).getDeclaredField((String) "Rawtext");
        ((Field) term50373).setAccessible(true);
        Object enum172 = ((Field) term50373).get((Object) null);
        Class<? extends Object> term50637 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term50636 = ((Class) term50637).getDeclaredField((String) "Doctype");
        ((Field) term50636).setAccessible(true);
        Object enum173 = ((Field) term50636).get((Object) null);
        Class<? extends Object> term50841 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term50840 = ((Class) term50841).getDeclaredField((String) "Comment");
        ((Field) term50840).setAccessible(true);
        Object enum174 = ((Field) term50840).get((Object) null);
        Class<? extends Object> term51059 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term51058 = ((Class) term51059).getDeclaredField((String) "StartTag");
        ((Field) term51058).setAccessible(true);
        Object enum175 = ((Field) term51058).get((Object) null);
        term13815 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term13816 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term13832 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term13848 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13849 = (byte[]) newByteArray(16);
        Object term13868 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13869 = (byte[]) newByteArray(16);
        Object term13888 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term13889 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13890 = (byte[]) newByteArray(16);
        Object term13909 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13910 = (byte[]) newByteArray(16);
        Object term13929 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13930 = (byte[]) newByteArray(16);
        Object term13961 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term13962 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13963 = (byte[]) newByteArray(16);
        Object term13993 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term14031 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13816, term13816.getClass(), "input", "gGSMzuGICf");
        setIntField(term13816, term13816.getClass(), "length", 2055867847);
        setIntField(term13816, term13816.getClass(), "pos", -1048298087);
        setIntField(term13816, term13816.getClass(), "mark", 292681826);
        setField(term13815, term13815.getClass(), "reader", term13816);
        setIntField(term13832, term13832.getClass(), "maxSize", 0);
        setField(term13832, term13832.getClass(), "elementData", null);
        setIntField(term13832, term13832.getClass(), "size", 0);
        setIntField(term13832, term13832.getClass(), "modCount", 0);
        setField(term13815, term13815.getClass(), "errors", term13832);
        setField(term13815, term13815.getClass(), "state", enum172);
        setField(term13815, term13815.getClass(), "emitPending", null);
        setBooleanField(term13815, term13815.getClass(), "isEmitPending", true);
        setField(term13848, term13848.getClass(), "value", term13849);
        setByteField(term13848, term13848.getClass(), "coder", (byte) 121);
        setIntField(term13848, term13848.getClass(), "count", 458147407);
        setField(term13815, term13815.getClass(), "charBuffer", term13848);
        setField(term13868, term13868.getClass(), "value", term13869);
        setByteField(term13868, term13868.getClass(), "coder", (byte) -99);
        setIntField(term13868, term13868.getClass(), "count", -184153539);
        setField(term13815, term13815.getClass(), "dataBuffer", term13868);
        setField(term13815, term13815.getClass(), "tagPending", null);
        setField(term13889, term13889.getClass(), "value", term13890);
        setByteField(term13889, term13889.getClass(), "coder", (byte) 0);
        setIntField(term13889, term13889.getClass(), "count", 0);
        setField(term13888, term13888.getClass(), "name", term13889);
        setField(term13909, term13909.getClass(), "value", term13910);
        setByteField(term13909, term13909.getClass(), "coder", (byte) 0);
        setIntField(term13909, term13909.getClass(), "count", 0);
        setField(term13888, term13888.getClass(), "publicIdentifier", term13909);
        setField(term13929, term13929.getClass(), "value", term13930);
        setByteField(term13929, term13929.getClass(), "coder", (byte) 0);
        setIntField(term13929, term13929.getClass(), "count", 0);
        setField(term13888, term13888.getClass(), "systemIdentifier", term13929);
        setBooleanField(term13888, term13888.getClass(), "forceQuirks", true);
        setField(term13888, term13888.getClass(), "type", enum173);
        setField(term13815, term13815.getClass(), "doctypePending", term13888);
        setField(term13962, term13962.getClass(), "value", term13963);
        setByteField(term13962, term13962.getClass(), "coder", (byte) 0);
        setIntField(term13962, term13962.getClass(), "count", 0);
        setField(term13961, term13961.getClass(), "data", term13962);
        setField(term13961, term13961.getClass(), "type", enum174);
        setField(term13815, term13815.getClass(), "commentPending", term13961);
        setField(term13993, term13993.getClass(), "tagName", "hxCBltsObl");
        setField(term13993, term13993.getClass(), "pendingAttributeName", "BndsHwAFMv");
        setField(term13993, term13993.getClass(), "pendingAttributeValue", "GzFkzHGYFt");
        setBooleanField(term13993, term13993.getClass(), "selfClosing", false);
        setField(term14031, term14031.getClass(), "attributes", null);
        setField(term13993, term13993.getClass(), "attributes", term14031);
        setField(term13993, term13993.getClass(), "type", enum175);
        setField(term13815, term13815.getClass(), "lastStartTag", term13993);
        setBooleanField(term13815, term13815.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term13815, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


