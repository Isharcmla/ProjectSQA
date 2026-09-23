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

public class Parser_xmlParser_197888626133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8196;

    public Parser_xmlParser_197888626133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8607 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term8606 = ((Class) term8607).getDeclaredField((String) "Comment");
        ((Field) term8606).setAccessible(true);
        Object enum2 = ((Field) term8606).get((Object) null);
        Class<? extends Object> term8811 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term8810 = ((Class) term8811).getDeclaredField((String) "Character");
        ((Field) term8810).setAccessible(true);
        Object enum3 = ((Field) term8810).get((Object) null);
        term8196 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term8197 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term8199 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term8201 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8203 = (byte[]) newByteArray(16);
        Object term8237 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term8241 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term8242 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8243 = (byte[]) newByteArray(16);
        Object term8276 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term8197, term8197.getClass(), "reader", null);
        setField(term8197, term8197.getClass(), "tokeniser", null);
        setField(term8197, term8197.getClass(), "doc", null);
        setField(term8197, term8197.getClass(), "stack", null);
        setField(term8197, term8197.getClass(), "baseUri", null);
        setField(term8197, term8197.getClass(), "currentToken", null);
        setField(term8197, term8197.getClass(), "errors", null);
        setField(term8197, term8197.getClass(), "settings", null);
        setField(term8199, term8199.getClass(), "tagName", null);
        setField(term8199, term8199.getClass(), "normalName", null);
        setField(term8199, term8199.getClass(), "pendingAttributeName", null);
        setField(term8201, term8201.getClass(), "value", term8203);
        setByteField(term8201, term8201.getClass(), "coder", (byte) 0);
        setIntField(term8201, term8201.getClass(), "count", 0);
        setField(term8199, term8199.getClass(), "pendingAttributeValue", term8201);
        setField(term8199, term8199.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term8199, term8199.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term8199, term8199.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term8199, term8199.getClass(), "selfClosing", false);
        setField(term8237, term8237.getClass(), "attributes", null);
        setField(term8199, term8199.getClass(), "attributes", term8237);
        setField(term8199, term8199.getClass(), "type", enum2);
        setField(term8197, term8197.getClass(), "start", term8199);
        setField(term8241, term8241.getClass(), "tagName", null);
        setField(term8241, term8241.getClass(), "normalName", null);
        setField(term8241, term8241.getClass(), "pendingAttributeName", null);
        setField(term8242, term8242.getClass(), "value", term8243);
        setByteField(term8242, term8242.getClass(), "coder", (byte) 0);
        setIntField(term8242, term8242.getClass(), "count", 0);
        setField(term8241, term8241.getClass(), "pendingAttributeValue", term8242);
        setField(term8241, term8241.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term8241, term8241.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term8241, term8241.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term8241, term8241.getClass(), "selfClosing", false);
        setField(term8241, term8241.getClass(), "attributes", null);
        setField(term8241, term8241.getClass(), "type", enum3);
        setField(term8197, term8197.getClass(), "end", term8241);
        setField(term8196, term8196.getClass(), "treeBuilder", term8197);
        setIntField(term8196, term8196.getClass(), "maxErrors", 0);
        setField(term8196, term8196.getClass(), "errors", null);
        setBooleanField(term8276, term8276.getClass(), "preserveTagCase", true);
        setBooleanField(term8276, term8276.getClass(), "preserveAttributeCase", true);
        setField(term8196, term8196.getClass(), "settings", term8276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "xmlParser", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term8196));
    }

};


