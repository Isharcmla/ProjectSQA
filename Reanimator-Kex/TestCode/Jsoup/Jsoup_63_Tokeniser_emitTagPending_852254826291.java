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

public class Tokeniser_emitTagPending_852254826291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257071;

    public Tokeniser_emitTagPending_852254826291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term258029 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term258028 = ((Class) term258029).getDeclaredField((String) "EndTag");
        ((Field) term258028).setAccessible(true);
        Object enum513 = ((Field) term258028).get((Object) null);
        term257071 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term257139 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term257139, term257139.getClass(), "pendingAttributeName", "");
        setField(term257139, term257139.getClass(), "attributes", null);
        setBooleanField(term257139, term257139.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term257139, term257139.getClass(), "hasPendingAttributeValue", false);
        setField(term257139, term257139.getClass(), "pendingAttributeValue", null);
        setField(term257139, term257139.getClass(), "pendingAttributeValueS", null);
        setField(term257139, term257139.getClass(), "type", enum513);
        setField(term257071, term257071.getClass(), "tagPending", term257139);
        setBooleanField(term257071, term257071.getClass(), "isEmitPending", false);
        setField(term257071, term257071.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term257071, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


