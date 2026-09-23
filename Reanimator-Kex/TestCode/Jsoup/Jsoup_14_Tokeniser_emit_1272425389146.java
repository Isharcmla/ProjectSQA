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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232520;
     Object term232584;

    public Tokeniser_emit_1272425389146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232520 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term232520, term232520.getClass(), "isEmitPending", false);
        setField(term232520, term232520.getClass(), "emitPending", null);
        Class<? extends Object> term233776 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term233775 = ((Class) term233776).getDeclaredField((String) "EndTag");
        ((Field) term233775).setAccessible(true);
        Object enum805 = ((Field) term233775).get((Object) null);
        term232584 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term232584, term232584.getClass(), "type", enum805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term232584;
        try {
            callMethod(klass, "emit", argTypes, term232520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


