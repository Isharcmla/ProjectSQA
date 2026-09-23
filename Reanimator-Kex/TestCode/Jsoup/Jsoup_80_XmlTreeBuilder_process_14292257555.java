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
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197694;
     Object term197758;
     Object term198056;
     Object term198057;

    public XmlTreeBuilder_process_14292257555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197694 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term198063 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198062 = ((Class) term198063).getDeclaredField((String) "EOF");
        ((Field) term198062).setAccessible(true);
        Object enum230 = ((Field) term198062).get((Object) null);
        term197758 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term197758, term197758.getClass(), "type", enum230);
        term198056 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term198056, term198056.getClass(), "reader", null);
        setField(term198056, term198056.getClass(), "tokeniser", null);
        setField(term198056, term198056.getClass(), "doc", null);
        setField(term198056, term198056.getClass(), "stack", null);
        setField(term198056, term198056.getClass(), "baseUri", null);
        setField(term198056, term198056.getClass(), "currentToken", null);
        setField(term198056, term198056.getClass(), "errors", null);
        setField(term198056, term198056.getClass(), "settings", null);
        setField(term198056, term198056.getClass(), "start", null);
        setField(term198056, term198056.getClass(), "end", null);
        Class<? extends Object> term198239 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198238 = ((Class) term198239).getDeclaredField((String) "EOF");
        ((Field) term198238).setAccessible(true);
        Object enum231 = ((Field) term198238).get((Object) null);
        term198057 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term198057, term198057.getClass(), "tagName", null);
        setField(term198057, term198057.getClass(), "normalName", null);
        setField(term198057, term198057.getClass(), "pendingAttributeName", null);
        setField(term198057, term198057.getClass(), "pendingAttributeValue", null);
        setField(term198057, term198057.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term198057, term198057.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term198057, term198057.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term198057, term198057.getClass(), "selfClosing", false);
        setField(term198057, term198057.getClass(), "attributes", null);
        setField(term198057, term198057.getClass(), "type", enum231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term197758;
        Object retValue = callMethod(klass, "process", argTypes, term197694, args);
        assertTrue(recursiveEquals(term197694, term198056));
        assertTrue(recursiveEquals(term197758, term198057));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


