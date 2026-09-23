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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Tokeniser_emit_1272425389241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358454;
     Object term358518;

    public Tokeniser_emit_1272425389241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358454 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term358454, term358454.getClass(), "isEmitPending", false);
        setField(term358454, term358454.getClass(), "emitPending", null);
        Class<? extends Object> term358850 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term358849 = ((Class) term358850).getDeclaredField((String) "EndTag");
        ((Field) term358849).setAccessible(true);
        Object enum913 = ((Field) term358849).get((Object) null);
        LinkedHashMap term358744 = new LinkedHashMap();
        ((LinkedHashMap) term358744).put((Object)null, (Object)null);
        term358518 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term358684 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term358518, term358518.getClass(), "type", enum913);
        setField(term358684, term358684.getClass(), "attributes", term358744);
        setField(term358518, term358518.getClass(), "attributes", term358684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term358518;
        callMethod(klass, "emit", argTypes, term358454, args);
    }

};


