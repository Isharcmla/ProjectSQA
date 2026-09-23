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

public class Tokeniser_emitTagPending_852254826271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234260;

    public Tokeniser_emitTagPending_852254826271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235799 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term235798 = ((Class) term235799).getDeclaredField((String) "StartTag");
        ((Field) term235798).setAccessible(true);
        Object enum495 = ((Field) term235798).get((Object) null);
        term234260 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term234324 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term234536 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term234324, term234324.getClass(), "pendingAttributeName", "");
        setField(term234324, term234324.getClass(), "attributes", null);
        setBooleanField(term234324, term234324.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term234324, term234324.getClass(), "hasPendingAttributeValue", false);
        setField(term234324, term234324.getClass(), "pendingAttributeValue", null);
        setField(term234324, term234324.getClass(), "pendingAttributeValueS", null);
        setField(term234324, term234324.getClass(), "type", enum495);
        setField(term234260, term234260.getClass(), "tagPending", term234324);
        setBooleanField(term234260, term234260.getClass(), "isEmitPending", false);
        setField(term234260, term234260.getClass(), "emitPending", term234536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term234260, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


