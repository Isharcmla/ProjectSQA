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

public class Tokeniser_emitTagPending_852254826193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193487;

    public Tokeniser_emitTagPending_852254826193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194463 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194462 = ((Class) term194463).getDeclaredField((String) "EndTag");
        ((Field) term194462).setAccessible(true);
        Object enum460 = ((Field) term194462).get((Object) null);
        term193487 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term193555 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term193727 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term193555, term193555.getClass(), "pendingAttributeName", null);
        setField(term193555, term193555.getClass(), "type", enum460);
        setField(term193487, term193487.getClass(), "tagPending", term193555);
        setBooleanField(term193487, term193487.getClass(), "isEmitPending", false);
        setField(term193487, term193487.getClass(), "emitPending", term193727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term193487, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


