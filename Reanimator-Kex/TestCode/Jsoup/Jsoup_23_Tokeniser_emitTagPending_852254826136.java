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

public class Tokeniser_emitTagPending_852254826136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118337;

    public Tokeniser_emitTagPending_852254826136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119666 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term119665 = ((Class) term119666).getDeclaredField((String) "EndTag");
        ((Field) term119665).setAccessible(true);
        Object enum308 = ((Field) term119665).get((Object) null);
        term118337 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term118401 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term118567 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term118401, term118401.getClass(), "pendingAttributeName", null);
        setField(term118401, term118401.getClass(), "type", enum308);
        setField(term118337, term118337.getClass(), "tagPending", term118401);
        setBooleanField(term118337, term118337.getClass(), "isEmitPending", false);
        setField(term118337, term118337.getClass(), "emitPending", term118567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term118337, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


