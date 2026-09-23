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

public class Tokeniser_emitTagPending_852254826357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325990;

    public Tokeniser_emitTagPending_852254826357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term326854 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term326853 = ((Class) term326854).getDeclaredField((String) "EndTag");
        ((Field) term326853).setAccessible(true);
        Object enum556 = ((Field) term326853).get((Object) null);
        term325990 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term326054 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term326268 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term326338 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term326054, term326054.getClass(), "pendingAttributeName", "");
        setField(term326054, term326054.getClass(), "attributes", null);
        setBooleanField(term326054, term326054.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term326054, term326054.getClass(), "hasPendingAttributeValue", false);
        setField(term326054, term326054.getClass(), "pendingAttributeValue", null);
        setField(term326054, term326054.getClass(), "pendingAttributeValueS", null);
        setField(term326054, term326054.getClass(), "type", enum556);
        setField(term325990, term325990.getClass(), "tagPending", term326054);
        setBooleanField(term325990, term325990.getClass(), "isEmitPending", false);
        setField(term325990, term325990.getClass(), "emitPending", null);
        setIntField(term326268, term326268.getClass(), "maxSize", 2147483647);
        setField(term325990, term325990.getClass(), "errors", term326268);
        setField(term325990, term325990.getClass(), "reader", term326338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term325990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


