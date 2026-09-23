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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_55105062127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65303;
     Object term65419;
     Object term67210;
     Object term67213;

    public XmlTreeBuilder_popStackToClose_55105062127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65355 = new ArrayList();
        term65303 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term65303, term65303.getClass(), "stack", term65355);
        term65419 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term65419, term65419.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        ArrayList term67211 = new ArrayList();
        term67210 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term67210, term67210.getClass(), "reader", null);
        setField(term67210, term67210.getClass(), "tokeniser", null);
        setField(term67210, term67210.getClass(), "doc", null);
        setField(term67210, term67210.getClass(), "stack", term67211);
        setField(term67210, term67210.getClass(), "baseUri", null);
        setField(term67210, term67210.getClass(), "currentToken", null);
        setField(term67210, term67210.getClass(), "errors", null);
        setField(term67210, term67210.getClass(), "settings", null);
        setField(term67210, term67210.getClass(), "start", null);
        setField(term67210, term67210.getClass(), "end", null);
        term67213 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term67213, term67213.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term67213, term67213.getClass(), "normalName", null);
        setField(term67213, term67213.getClass(), "pendingAttributeName", null);
        setField(term67213, term67213.getClass(), "pendingAttributeValue", null);
        setField(term67213, term67213.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term67213, term67213.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term67213, term67213.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term67213, term67213.getClass(), "selfClosing", false);
        setField(term67213, term67213.getClass(), "attributes", null);
        setField(term67213, term67213.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term65419;
        callMethod(klass, "popStackToClose", argTypes, term65303, args);
        assertTrue(recursiveEquals(term65303, term67210));
        assertTrue(recursiveEquals(term65419, term67213));
    }

};


