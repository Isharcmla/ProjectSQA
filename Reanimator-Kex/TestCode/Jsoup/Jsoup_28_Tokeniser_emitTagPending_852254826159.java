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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139501;

    public Tokeniser_emitTagPending_852254826159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140480 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term140479 = ((Class) term140480).getDeclaredField((String) "StartTag");
        ((Field) term140479).setAccessible(true);
        Object enum317 = ((Field) term140479).get((Object) null);
        term139501 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term139565 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term139739 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term139565, term139565.getClass(), "pendingAttributeName", null);
        setField(term139565, term139565.getClass(), "type", enum317);
        setField(term139501, term139501.getClass(), "tagPending", term139565);
        setBooleanField(term139501, term139501.getClass(), "isEmitPending", false);
        setField(term139501, term139501.getClass(), "emitPending", term139739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term139501, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


