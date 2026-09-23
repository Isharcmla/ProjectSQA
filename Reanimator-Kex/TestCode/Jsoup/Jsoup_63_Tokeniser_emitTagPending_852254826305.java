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

public class Tokeniser_emitTagPending_852254826305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267376;

    public Tokeniser_emitTagPending_852254826305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268255 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term268254 = ((Class) term268255).getDeclaredField((String) "EndTag");
        ((Field) term268254).setAccessible(true);
        Object enum521 = ((Field) term268254).get((Object) null);
        term267376 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term267440 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term267606 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term267674 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term267744 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term267440, term267440.getClass(), "pendingAttributeName", null);
        setField(term267440, term267440.getClass(), "type", enum521);
        setField(term267440, term267440.getClass(), "attributes", term267606);
        setField(term267376, term267376.getClass(), "tagPending", term267440);
        setBooleanField(term267376, term267376.getClass(), "isEmitPending", false);
        setField(term267376, term267376.getClass(), "emitPending", null);
        setIntField(term267674, term267674.getClass(), "maxSize", 2147483647);
        setField(term267376, term267376.getClass(), "errors", term267674);
        setField(term267376, term267376.getClass(), "reader", term267744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term267376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


