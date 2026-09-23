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

public class Tokeniser_emit_1272425389243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229651;
     Object term229911;

    public Tokeniser_emit_1272425389243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229651 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term229709 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Object term229777 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term229847 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term229651, term229651.getClass(), "isEmitPending", false);
        setField(term229651, term229651.getClass(), "emitPending", term229709);
        setIntField(term229777, term229777.getClass(), "maxSize", 2147483647);
        setField(term229651, term229651.getClass(), "errors", term229777);
        setField(term229651, term229651.getClass(), "reader", term229847);
        Class<? extends Object> term230570 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term230569 = ((Class) term230570).getDeclaredField((String) "EndTag");
        ((Field) term230569).setAccessible(true);
        Object enum383 = ((Field) term230569).get((Object) null);
        term229911 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term230077 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term229911, term229911.getClass(), "type", enum383);
        setField(term229911, term229911.getClass(), "attributes", term230077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term229911;
        try {
            callMethod(klass, "emit", argTypes, term229651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


