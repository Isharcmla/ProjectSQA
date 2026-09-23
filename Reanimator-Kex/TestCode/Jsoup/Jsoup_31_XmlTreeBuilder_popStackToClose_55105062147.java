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

public class XmlTreeBuilder_popStackToClose_55105062147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44739;
     Object term44885;
     Object term44982;
     Object term44984;

    public XmlTreeBuilder_popStackToClose_55105062147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44739 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term44821 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term44739, term44739.getClass(), "stack", term44821);
        term44885 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term44885, term44885.getClass(), "tagName", "         ");
        term44982 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term44983 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term44982, term44982.getClass(), "reader", null);
        setField(term44982, term44982.getClass(), "tokeniser", null);
        setField(term44982, term44982.getClass(), "doc", null);
        setIntField(term44983, term44983.getClass(), "size", 0);
        setField(term44983, term44983.getClass(), "first", null);
        setField(term44983, term44983.getClass(), "last", null);
        setIntField(term44983, term44983.getClass(), "modCount", 0);
        setField(term44982, term44982.getClass(), "stack", term44983);
        setField(term44982, term44982.getClass(), "baseUri", null);
        setField(term44982, term44982.getClass(), "currentToken", null);
        setField(term44982, term44982.getClass(), "errors", null);
        term44984 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term44984, term44984.getClass(), "tagName", "         ");
        setField(term44984, term44984.getClass(), "pendingAttributeName", null);
        setField(term44984, term44984.getClass(), "pendingAttributeValue", null);
        setBooleanField(term44984, term44984.getClass(), "selfClosing", false);
        setField(term44984, term44984.getClass(), "attributes", null);
        setField(term44984, term44984.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term44885;
        callMethod(klass, "popStackToClose", argTypes, term44739, args);
        assertTrue(recursiveEquals(term44739, term44982));
        assertTrue(recursiveEquals(term44885, term44984));
    }

};


