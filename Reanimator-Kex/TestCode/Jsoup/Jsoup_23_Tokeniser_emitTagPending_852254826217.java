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

public class Tokeniser_emitTagPending_852254826217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180644;

    public Tokeniser_emitTagPending_852254826217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181628 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term181627 = ((Class) term181628).getDeclaredField((String) "EndTag");
        ((Field) term181627).setAccessible(true);
        Object enum360 = ((Field) term181627).get((Object) null);
        Object term181024 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term180934 = new LinkedHashMap();
        ((LinkedHashMap) term180934).put(term181024, term181024);
        term180644 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term180708 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term180874 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term180708, term180708.getClass(), "pendingAttributeName", null);
        setField(term180708, term180708.getClass(), "type", enum360);
        setField(term180874, term180874.getClass(), "attributes", term180934);
        setField(term180708, term180708.getClass(), "attributes", term180874);
        setField(term180644, term180644.getClass(), "tagPending", term180708);
        setBooleanField(term180644, term180644.getClass(), "isEmitPending", false);
        setField(term180644, term180644.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term180644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


