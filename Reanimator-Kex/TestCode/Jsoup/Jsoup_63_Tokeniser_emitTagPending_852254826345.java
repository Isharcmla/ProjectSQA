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

public class Tokeniser_emitTagPending_852254826345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308447;

    public Tokeniser_emitTagPending_852254826345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term307332 = (char[]) newCharArray(489);
        setCharElement(term307332, 0, 'E');
        setCharElement(term307332, 1, 'O');
        setCharElement(term307332, 2, 'F');
        StringBuilder term308667 = new StringBuilder();
        ((StringBuilder) term308667).append(term307332);
        Class<? extends Object> term311302 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term311301 = ((Class) term311302).getDeclaredField((String) "EndTag");
        ((Field) term311301).setAccessible(true);
        Object enum543 = ((Field) term311301).get((Object) null);
        term308447 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term308511 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term308607 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term308841 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term308511, term308511.getClass(), "pendingAttributeName", "");
        setField(term308511, term308511.getClass(), "attributes", term308607);
        setBooleanField(term308511, term308511.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term308511, term308511.getClass(), "hasPendingAttributeValue", false);
        setField(term308511, term308511.getClass(), "pendingAttributeValue", term308667);
        setField(term308511, term308511.getClass(), "pendingAttributeValueS", null);
        setField(term308511, term308511.getClass(), "type", enum543);
        setField(term308447, term308447.getClass(), "tagPending", term308511);
        setBooleanField(term308447, term308447.getClass(), "isEmitPending", false);
        setField(term308447, term308447.getClass(), "emitPending", term308841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term308447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


