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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203289;
     Object term204113;

    public Tokeniser_emitTagPending_852254826239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204124 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term204123 = ((Class) term204124).getDeclaredField((String) "EndTag");
        ((Field) term204123).setAccessible(true);
        Object enum372 = ((Field) term204123).get((Object) null);
        LinkedHashMap term203579 = new LinkedHashMap();
        ((LinkedHashMap) term203579).put((Object)null, (Object)null);
        ((LinkedHashMap) term203579).put((Object)null, (Object)null);
        term203289 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term203353 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term203519 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term203751 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term203353, term203353.getClass(), "pendingAttributeName", null);
        setField(term203353, term203353.getClass(), "type", enum372);
        setField(term203519, term203519.getClass(), "attributes", term203579);
        setField(term203353, term203353.getClass(), "attributes", term203519);
        setField(term203289, term203289.getClass(), "tagPending", term203353);
        setBooleanField(term203289, term203289.getClass(), "isEmitPending", false);
        setField(term203289, term203289.getClass(), "emitPending", null);
        setField(term203289, term203289.getClass(), "errors", term203751);
        LinkedHashMap term204117 = new LinkedHashMap();
        Class<? extends Object> term204309 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term204308 = ((Class) term204309).getDeclaredField((String) "EndTag");
        ((Field) term204308).setAccessible(true);
        Object enum373 = ((Field) term204308).get((Object) null);
        term204113 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term204114 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term204115 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term204116 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term204113, term204113.getClass(), "reader", null);
        setIntField(term204114, term204114.getClass(), "maxSize", 0);
        setField(term204114, term204114.getClass(), "elementData", null);
        setIntField(term204114, term204114.getClass(), "size", 0);
        setIntField(term204114, term204114.getClass(), "modCount", 0);
        setField(term204113, term204113.getClass(), "errors", term204114);
        setField(term204113, term204113.getClass(), "state", null);
        setField(term204115, term204115.getClass(), "tagName", null);
        setField(term204115, term204115.getClass(), "pendingAttributeName", null);
        setField(term204115, term204115.getClass(), "pendingAttributeValue", null);
        setBooleanField(term204115, term204115.getClass(), "selfClosing", false);
        setField(term204116, term204116.getClass(), "attributes", term204117);
        setField(term204115, term204115.getClass(), "attributes", term204116);
        setField(term204115, term204115.getClass(), "type", enum373);
        setField(term204113, term204113.getClass(), "emitPending", term204115);
        setBooleanField(term204113, term204113.getClass(), "isEmitPending", true);
        setField(term204113, term204113.getClass(), "charBuffer", null);
        setField(term204113, term204113.getClass(), "dataBuffer", null);
        setField(term204113, term204113.getClass(), "tagPending", term204115);
        setField(term204113, term204113.getClass(), "doctypePending", null);
        setField(term204113, term204113.getClass(), "commentPending", null);
        setField(term204113, term204113.getClass(), "lastStartTag", null);
        setBooleanField(term204113, term204113.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term203289, args);
        assertTrue(recursiveEquals(term203289, term204113));
    }

};


