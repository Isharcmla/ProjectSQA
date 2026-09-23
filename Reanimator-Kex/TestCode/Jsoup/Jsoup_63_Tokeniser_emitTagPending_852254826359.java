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

public class Tokeniser_emitTagPending_852254826359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328507;

    public Tokeniser_emitTagPending_852254826359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term327380 = (char[]) newCharArray(489);
        setCharElement(term327380, 0, 'D');
        setCharElement(term327380, 1, 'o');
        setCharElement(term327380, 2, 'c');
        setCharElement(term327380, 3, 't');
        setCharElement(term327380, 4, 'y');
        setCharElement(term327380, 5, 'p');
        setCharElement(term327380, 6, 'e');
        StringBuilder term328669 = new StringBuilder();
        ((StringBuilder) term328669).append(term327380);
        Class<? extends Object> term331314 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term331313 = ((Class) term331314).getDeclaredField((String) "EndTag");
        ((Field) term331313).setAccessible(true);
        Object enum558 = ((Field) term331313).get((Object) null);
        term328507 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term328571 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term328845 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term328571, term328571.getClass(), "pendingAttributeName", "");
        setField(term328571, term328571.getClass(), "attributes", null);
        setBooleanField(term328571, term328571.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term328571, term328571.getClass(), "hasPendingAttributeValue", false);
        setField(term328571, term328571.getClass(), "pendingAttributeValue", term328669);
        setField(term328571, term328571.getClass(), "pendingAttributeValueS", null);
        setField(term328571, term328571.getClass(), "type", enum558);
        setField(term328507, term328507.getClass(), "tagPending", term328571);
        setBooleanField(term328507, term328507.getClass(), "isEmitPending", false);
        setField(term328507, term328507.getClass(), "emitPending", null);
        setIntField(term328845, term328845.getClass(), "maxSize", 2147483647);
        setField(term328507, term328507.getClass(), "errors", term328845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term328507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


