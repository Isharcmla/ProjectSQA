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

public class Tokeniser_emitTagPending_852254826229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215378;

    public Tokeniser_emitTagPending_852254826229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216084 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term216083 = ((Class) term216084).getDeclaredField((String) "EndTag");
        ((Field) term216083).setAccessible(true);
        Object enum482 = ((Field) term216083).get((Object) null);
        term215378 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term215442 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term215442, term215442.getClass(), "pendingAttributeName", "");
        setField(term215442, term215442.getClass(), "attributes", null);
        setBooleanField(term215442, term215442.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term215442, term215442.getClass(), "hasPendingAttributeValue", false);
        setField(term215442, term215442.getClass(), "pendingAttributeValue", null);
        setField(term215442, term215442.getClass(), "pendingAttributeValueS", null);
        setField(term215442, term215442.getClass(), "type", enum482);
        setField(term215378, term215378.getClass(), "tagPending", term215442);
        setBooleanField(term215378, term215378.getClass(), "isEmitPending", false);
        setField(term215378, term215378.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term215378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


