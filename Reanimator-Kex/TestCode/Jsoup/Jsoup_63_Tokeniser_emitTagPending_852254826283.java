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
import java.lang.StringBuilder;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244745;

    public Tokeniser_emitTagPending_852254826283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term243624 = (char[]) newCharArray(489);
        setCharElement(term243624, 0, 'E');
        setCharElement(term243624, 1, 'n');
        setCharElement(term243624, 2, 'd');
        setCharElement(term243624, 3, 'T');
        setCharElement(term243624, 4, 'a');
        setCharElement(term243624, 5, 'g');
        StringBuilder term244907 = new StringBuilder();
        ((StringBuilder) term244907).append(term243624);
        Class<? extends Object> term247521 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term247520 = ((Class) term247521).getDeclaredField((String) "EndTag");
        ((Field) term247520).setAccessible(true);
        Object enum505 = ((Field) term247520).get((Object) null);
        term244745 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term244809 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term244809, term244809.getClass(), "pendingAttributeName", "");
        setField(term244809, term244809.getClass(), "attributes", null);
        setBooleanField(term244809, term244809.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term244809, term244809.getClass(), "hasPendingAttributeValue", false);
        setField(term244809, term244809.getClass(), "pendingAttributeValue", term244907);
        setField(term244809, term244809.getClass(), "pendingAttributeValueS", "EOF");
        setField(term244809, term244809.getClass(), "type", enum505);
        setField(term244745, term244745.getClass(), "tagPending", term244809);
        setBooleanField(term244745, term244745.getClass(), "isEmitPending", false);
        setField(term244745, term244745.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term244745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


