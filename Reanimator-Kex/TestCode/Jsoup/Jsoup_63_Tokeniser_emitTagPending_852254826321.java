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

public class Tokeniser_emitTagPending_852254826321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281938;

    public Tokeniser_emitTagPending_852254826321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282721 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term282720 = ((Class) term282721).getDeclaredField((String) "EndTag");
        ((Field) term282720).setAccessible(true);
        Object enum531 = ((Field) term282720).get((Object) null);
        term281938 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term282002 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term282216 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term282002, term282002.getClass(), "pendingAttributeName", "");
        setField(term282002, term282002.getClass(), "attributes", null);
        setBooleanField(term282002, term282002.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term282002, term282002.getClass(), "hasPendingAttributeValue", false);
        setField(term282002, term282002.getClass(), "pendingAttributeValue", null);
        setField(term282002, term282002.getClass(), "pendingAttributeValueS", null);
        setField(term282002, term282002.getClass(), "type", enum531);
        setField(term281938, term281938.getClass(), "tagPending", term282002);
        setBooleanField(term281938, term281938.getClass(), "isEmitPending", false);
        setField(term281938, term281938.getClass(), "emitPending", null);
        setIntField(term282216, term282216.getClass(), "maxSize", 2147483647);
        setField(term281938, term281938.getClass(), "errors", term282216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term281938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


