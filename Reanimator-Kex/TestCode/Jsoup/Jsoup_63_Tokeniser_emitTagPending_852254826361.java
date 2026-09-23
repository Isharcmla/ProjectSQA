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

public class Tokeniser_emitTagPending_852254826361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331844;

    public Tokeniser_emitTagPending_852254826361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term332722 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term332721 = ((Class) term332722).getDeclaredField((String) "EndTag");
        ((Field) term332721).setAccessible(true);
        Object enum560 = ((Field) term332721).get((Object) null);
        term331844 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term331908 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term332004 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term332218 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term331908, term331908.getClass(), "pendingAttributeName", "");
        setField(term331908, term331908.getClass(), "attributes", term332004);
        setBooleanField(term331908, term331908.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term331908, term331908.getClass(), "hasPendingAttributeValue", false);
        setField(term331908, term331908.getClass(), "pendingAttributeValue", null);
        setField(term331908, term331908.getClass(), "pendingAttributeValueS", "");
        setField(term331908, term331908.getClass(), "type", enum560);
        setField(term331844, term331844.getClass(), "tagPending", term331908);
        setBooleanField(term331844, term331844.getClass(), "isEmitPending", false);
        setField(term331844, term331844.getClass(), "emitPending", null);
        setIntField(term332218, term332218.getClass(), "maxSize", 2147483647);
        setField(term331844, term331844.getClass(), "errors", term332218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term331844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


