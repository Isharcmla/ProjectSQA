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

public class Tokeniser_emitTagPending_852254826391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369165;

    public Tokeniser_emitTagPending_852254826391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term370130 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term370129 = ((Class) term370130).getDeclaredField((String) "EndTag");
        ((Field) term370129).setAccessible(true);
        Object enum582 = ((Field) term370129).get((Object) null);
        term369165 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term369229 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term369325 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term369539 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term369609 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term369229, term369229.getClass(), "pendingAttributeName", "");
        setField(term369229, term369229.getClass(), "attributes", term369325);
        setBooleanField(term369229, term369229.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term369229, term369229.getClass(), "hasPendingAttributeValue", false);
        setField(term369229, term369229.getClass(), "pendingAttributeValue", null);
        setField(term369229, term369229.getClass(), "pendingAttributeValueS", "EOF");
        setField(term369229, term369229.getClass(), "type", enum582);
        setField(term369165, term369165.getClass(), "tagPending", term369229);
        setBooleanField(term369165, term369165.getClass(), "isEmitPending", false);
        setField(term369165, term369165.getClass(), "emitPending", null);
        setIntField(term369539, term369539.getClass(), "maxSize", 2147483647);
        setField(term369165, term369165.getClass(), "errors", term369539);
        setField(term369165, term369165.getClass(), "reader", term369609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term369165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


