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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297528;
     Object term298115;

    public Tokeniser_emitTagPending_852254826201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term298123 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term298122 = ((Class) term298123).getDeclaredField((String) "EndTag");
        ((Field) term298122).setAccessible(true);
        Object enum867 = ((Field) term298122).get((Object) null);
        LinkedHashMap term297818 = new LinkedHashMap();
        term297528 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term297592 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term297758 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term297592, term297592.getClass(), "pendingAttributeName", null);
        setField(term297592, term297592.getClass(), "type", enum867);
        setField(term297758, term297758.getClass(), "attributes", term297818);
        setField(term297592, term297592.getClass(), "attributes", term297758);
        setField(term297528, term297528.getClass(), "tagPending", term297592);
        setBooleanField(term297528, term297528.getClass(), "isEmitPending", false);
        setField(term297528, term297528.getClass(), "emitPending", null);
        LinkedHashMap term298118 = new LinkedHashMap();
        Class<? extends Object> term298308 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term298307 = ((Class) term298308).getDeclaredField((String) "EndTag");
        ((Field) term298307).setAccessible(true);
        Object enum868 = ((Field) term298307).get((Object) null);
        term298115 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term298116 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term298117 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term298115, term298115.getClass(), "reader", null);
        setBooleanField(term298115, term298115.getClass(), "trackErrors", false);
        setField(term298115, term298115.getClass(), "errors", null);
        setField(term298115, term298115.getClass(), "state", null);
        setField(term298116, term298116.getClass(), "tagName", null);
        setField(term298116, term298116.getClass(), "pendingAttributeName", null);
        setField(term298116, term298116.getClass(), "pendingAttributeValue", null);
        setBooleanField(term298116, term298116.getClass(), "selfClosing", false);
        setField(term298117, term298117.getClass(), "attributes", term298118);
        setField(term298116, term298116.getClass(), "attributes", term298117);
        setField(term298116, term298116.getClass(), "type", enum868);
        setField(term298115, term298115.getClass(), "emitPending", term298116);
        setBooleanField(term298115, term298115.getClass(), "isEmitPending", true);
        setField(term298115, term298115.getClass(), "charBuffer", null);
        setField(term298115, term298115.getClass(), "dataBuffer", null);
        setField(term298115, term298115.getClass(), "tagPending", term298116);
        setField(term298115, term298115.getClass(), "doctypePending", null);
        setField(term298115, term298115.getClass(), "commentPending", null);
        setField(term298115, term298115.getClass(), "lastStartTag", null);
        setBooleanField(term298115, term298115.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term297528, args);
        assertTrue(recursiveEquals(term297528, term298115));
    }

};


