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

public class XmlTreeBuilder_process_14292257529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55705;
     Object term55769;
     Object term56067;
     Object term56068;

    public XmlTreeBuilder_process_14292257529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55705 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term56074 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term56073 = ((Class) term56074).getDeclaredField((String) "EOF");
        ((Field) term56073).setAccessible(true);
        Object enum158 = ((Field) term56073).get((Object) null);
        term55769 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term55769, term55769.getClass(), "type", enum158);
        term56067 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term56067, term56067.getClass(), "reader", null);
        setField(term56067, term56067.getClass(), "tokeniser", null);
        setField(term56067, term56067.getClass(), "doc", null);
        setField(term56067, term56067.getClass(), "stack", null);
        setField(term56067, term56067.getClass(), "baseUri", null);
        setField(term56067, term56067.getClass(), "currentToken", null);
        setField(term56067, term56067.getClass(), "errors", null);
        setField(term56067, term56067.getClass(), "start", null);
        setField(term56067, term56067.getClass(), "end", null);
        Class<? extends Object> term56250 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term56249 = ((Class) term56250).getDeclaredField((String) "EOF");
        ((Field) term56249).setAccessible(true);
        Object enum159 = ((Field) term56249).get((Object) null);
        term56068 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term56068, term56068.getClass(), "tagName", null);
        setField(term56068, term56068.getClass(), "pendingAttributeName", null);
        setField(term56068, term56068.getClass(), "pendingAttributeValue", null);
        setField(term56068, term56068.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term56068, term56068.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term56068, term56068.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term56068, term56068.getClass(), "selfClosing", false);
        setField(term56068, term56068.getClass(), "attributes", null);
        setField(term56068, term56068.getClass(), "type", enum159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term55769;
        Object retValue = callMethod(klass, "process", argTypes, term55705, args);
        assertTrue(recursiveEquals(term55705, term56067));
        assertTrue(recursiveEquals(term55769, term56068));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


