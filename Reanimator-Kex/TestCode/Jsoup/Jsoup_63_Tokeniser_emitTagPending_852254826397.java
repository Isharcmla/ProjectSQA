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

public class Tokeniser_emitTagPending_852254826397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376818;

    public Tokeniser_emitTagPending_852254826397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term375691 = (char[]) newCharArray(489);
        setCharElement(term375691, 0, 'S');
        setCharElement(term375691, 1, 't');
        setCharElement(term375691, 2, 'a');
        setCharElement(term375691, 3, 'r');
        setCharElement(term375691, 4, 't');
        setCharElement(term375691, 5, 'T');
        setCharElement(term375691, 6, 'a');
        setCharElement(term375691, 7, 'g');
        StringBuilder term377038 = new StringBuilder();
        ((StringBuilder) term377038).append(term375691);
        Class<? extends Object> term379682 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term379681 = ((Class) term379682).getDeclaredField((String) "EndTag");
        ((Field) term379681).setAccessible(true);
        Object enum588 = ((Field) term379681).get((Object) null);
        term376818 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term376882 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term376978 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term377214 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term376882, term376882.getClass(), "pendingAttributeName", "");
        setField(term376882, term376882.getClass(), "attributes", term376978);
        setBooleanField(term376882, term376882.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term376882, term376882.getClass(), "hasPendingAttributeValue", false);
        setField(term376882, term376882.getClass(), "pendingAttributeValue", term377038);
        setField(term376882, term376882.getClass(), "pendingAttributeValueS", null);
        setField(term376882, term376882.getClass(), "type", enum588);
        setField(term376818, term376818.getClass(), "tagPending", term376882);
        setBooleanField(term376818, term376818.getClass(), "isEmitPending", false);
        setField(term376818, term376818.getClass(), "emitPending", null);
        setIntField(term377214, term377214.getClass(), "maxSize", 2147483647);
        setField(term376818, term376818.getClass(), "errors", term377214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term376818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


