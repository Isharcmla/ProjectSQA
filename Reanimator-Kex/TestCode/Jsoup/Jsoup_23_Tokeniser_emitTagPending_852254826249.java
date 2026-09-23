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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214832;

    public Tokeniser_emitTagPending_852254826249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215813 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term215812 = ((Class) term215813).getDeclaredField((String) "EndTag");
        ((Field) term215812).setAccessible(true);
        Object enum383 = ((Field) term215812).get((Object) null);
        LinkedHashMap term215122 = new LinkedHashMap();
        ((LinkedHashMap) term215122).put((Object)null, (Object)null);
        term214832 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term214896 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term215062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term215294 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term214896, term214896.getClass(), "pendingAttributeName", null);
        setField(term214896, term214896.getClass(), "type", enum383);
        setField(term215062, term215062.getClass(), "attributes", term215122);
        setField(term214896, term214896.getClass(), "attributes", term215062);
        setField(term214832, term214832.getClass(), "tagPending", term214896);
        setBooleanField(term214832, term214832.getClass(), "isEmitPending", false);
        setField(term214832, term214832.getClass(), "emitPending", null);
        setIntField(term215294, term215294.getClass(), "maxSize", 2147483647);
        setField(term214832, term214832.getClass(), "errors", term215294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term214832, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


