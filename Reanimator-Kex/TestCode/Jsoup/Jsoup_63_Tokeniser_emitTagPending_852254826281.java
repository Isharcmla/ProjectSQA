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

public class Tokeniser_emitTagPending_852254826281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242563;

    public Tokeniser_emitTagPending_852254826281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243366 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term243365 = ((Class) term243366).getDeclaredField((String) "EndTag");
        ((Field) term243365).setAccessible(true);
        Object enum503 = ((Field) term243365).get((Object) null);
        term242563 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term242627 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term242723 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term242627, term242627.getClass(), "pendingAttributeName", "");
        setField(term242627, term242627.getClass(), "attributes", term242723);
        setBooleanField(term242627, term242627.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term242627, term242627.getClass(), "hasPendingAttributeValue", false);
        setField(term242627, term242627.getClass(), "pendingAttributeValue", null);
        setField(term242627, term242627.getClass(), "pendingAttributeValueS", "");
        setField(term242627, term242627.getClass(), "type", enum503);
        setField(term242563, term242563.getClass(), "tagPending", term242627);
        setBooleanField(term242563, term242563.getClass(), "isEmitPending", false);
        setField(term242563, term242563.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term242563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


