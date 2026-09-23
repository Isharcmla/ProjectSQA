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
import java.lang.String;

public class Tokeniser_read_37425894225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Tokeniser_read_37425894225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30174 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term30173 = ((Class) term30174).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term30173).setAccessible(true);
        Object enum97 = ((Field) term30173).get((Object) null);
        Class<? extends Object> term30473 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30472 = ((Class) term30473).getDeclaredField((String) "Doctype");
        ((Field) term30472).setAccessible(true);
        Object enum98 = ((Field) term30472).get((Object) null);
        Class<? extends Object> term30677 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30676 = ((Class) term30677).getDeclaredField((String) "Comment");
        ((Field) term30676).setAccessible(true);
        Object enum99 = ((Field) term30676).get((Object) null);
        Class<? extends Object> term30895 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30894 = ((Class) term30895).getDeclaredField((String) "StartTag");
        ((Field) term30894).setAccessible(true);
        Object enum100 = ((Field) term30894).get((Object) null);
        term1 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term2 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term18 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term46 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term47 = (byte[]) newByteArray(16);
        Object term66 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term67 = (byte[]) newByteArray(16);
        Object term86 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term87 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term88 = (byte[]) newByteArray(16);
        Object term107 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term108 = (byte[]) newByteArray(16);
        Object term127 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term128 = (byte[]) newByteArray(16);
        Object term159 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term160 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term161 = (byte[]) newByteArray(16);
        Object term191 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term229 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2, term2.getClass(), "input", "sjlJAEtRrb");
        setIntField(term2, term2.getClass(), "length", 391863371);
        setIntField(term2, term2.getClass(), "pos", -1922583790);
        setIntField(term2, term2.getClass(), "mark", -616727354);
        setField(term1, term1.getClass(), "reader", term2);
        setIntField(term18, term18.getClass(), "maxSize", 0);
        setField(term18, term18.getClass(), "elementData", null);
        setIntField(term18, term18.getClass(), "size", 0);
        setIntField(term18, term18.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "errors", term18);
        setField(term1, term1.getClass(), "state", enum97);
        setField(term1, term1.getClass(), "emitPending", null);
        setBooleanField(term1, term1.getClass(), "isEmitPending", false);
        setField(term46, term46.getClass(), "value", term47);
        setByteField(term46, term46.getClass(), "coder", (byte) 47);
        setIntField(term46, term46.getClass(), "count", -1955890973);
        setField(term1, term1.getClass(), "charBuffer", term46);
        setField(term66, term66.getClass(), "value", term67);
        setByteField(term66, term66.getClass(), "coder", (byte) 48);
        setIntField(term66, term66.getClass(), "count", -2038273078);
        setField(term1, term1.getClass(), "dataBuffer", term66);
        setField(term1, term1.getClass(), "tagPending", null);
        setField(term87, term87.getClass(), "value", term88);
        setByteField(term87, term87.getClass(), "coder", (byte) 0);
        setIntField(term87, term87.getClass(), "count", 0);
        setField(term86, term86.getClass(), "name", term87);
        setField(term107, term107.getClass(), "value", term108);
        setByteField(term107, term107.getClass(), "coder", (byte) 0);
        setIntField(term107, term107.getClass(), "count", 0);
        setField(term86, term86.getClass(), "publicIdentifier", term107);
        setField(term127, term127.getClass(), "value", term128);
        setByteField(term127, term127.getClass(), "coder", (byte) 0);
        setIntField(term127, term127.getClass(), "count", 0);
        setField(term86, term86.getClass(), "systemIdentifier", term127);
        setBooleanField(term86, term86.getClass(), "forceQuirks", false);
        setField(term86, term86.getClass(), "type", enum98);
        setField(term1, term1.getClass(), "doctypePending", term86);
        setField(term160, term160.getClass(), "value", term161);
        setByteField(term160, term160.getClass(), "coder", (byte) 0);
        setIntField(term160, term160.getClass(), "count", 0);
        setField(term159, term159.getClass(), "data", term160);
        setField(term159, term159.getClass(), "type", enum99);
        setField(term1, term1.getClass(), "commentPending", term159);
        setField(term191, term191.getClass(), "tagName", "MuLcgQHgqz");
        setField(term191, term191.getClass(), "pendingAttributeName", "xxtlPwDYFs");
        setField(term191, term191.getClass(), "pendingAttributeValue", "jJCZpVmanW");
        setBooleanField(term191, term191.getClass(), "selfClosing", false);
        setField(term229, term229.getClass(), "attributes", null);
        setField(term191, term191.getClass(), "attributes", term229);
        setField(term191, term191.getClass(), "type", enum100);
        setField(term1, term1.getClass(), "lastStartTag", term191);
        setBooleanField(term1, term1.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term1, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


