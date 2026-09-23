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

public class Tokeniser_emitTagPending_852254826289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255560;

    public Tokeniser_emitTagPending_852254826289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256665 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term256664 = ((Class) term256665).getDeclaredField((String) "StartTag");
        ((Field) term256664).setAccessible(true);
        Object enum511 = ((Field) term256664).get((Object) null);
        term255560 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term255624 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term255720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term255624, term255624.getClass(), "pendingAttributeName", "Doctype");
        setField(term255624, term255624.getClass(), "attributes", term255720);
        setBooleanField(term255624, term255624.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term255624, term255624.getClass(), "hasPendingAttributeValue", false);
        setField(term255624, term255624.getClass(), "pendingAttributeValue", null);
        setField(term255624, term255624.getClass(), "pendingAttributeValueS", null);
        setField(term255624, term255624.getClass(), "type", enum511);
        setField(term255560, term255560.getClass(), "tagPending", term255624);
        setBooleanField(term255560, term255560.getClass(), "isEmitPending", false);
        setField(term255560, term255560.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term255560, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


