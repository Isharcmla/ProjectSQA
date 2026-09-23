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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237175;
     Object term237555;
     Object term237653;
     Object term237657;

    public XmlTreeBuilder_popStackToClose_551050621143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term237353 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term237399 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term237399, term237399.getClass(), "tagName", "");
        setField(term237353, term237353.getClass(), "tag", term237399);
        Object term237491 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term237293 = new ArrayList();
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add((Object)null);
        ((ArrayList) term237293).add(term237353);
        ((ArrayList) term237293).add(term237491);
        term237175 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term237241 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term237241, term237241.getClass(), "preserveTagCase", false);
        setField(term237175, term237175.getClass(), "settings", term237241);
        setField(term237175, term237175.getClass(), "stack", term237293);
        term237555 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term237555, term237555.getClass(), "tagName", "");
        ArrayList term237654 = new ArrayList();
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        ((ArrayList) term237654).add((Object)null);
        term237653 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term237656 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term237653, term237653.getClass(), "parser", null);
        setField(term237653, term237653.getClass(), "reader", null);
        setField(term237653, term237653.getClass(), "tokeniser", null);
        setField(term237653, term237653.getClass(), "doc", null);
        setField(term237653, term237653.getClass(), "stack", term237654);
        setField(term237653, term237653.getClass(), "baseUri", null);
        setField(term237653, term237653.getClass(), "currentToken", null);
        setBooleanField(term237656, term237656.getClass(), "preserveTagCase", false);
        setBooleanField(term237656, term237656.getClass(), "preserveAttributeCase", false);
        setField(term237653, term237653.getClass(), "settings", term237656);
        setField(term237653, term237653.getClass(), "start", null);
        setField(term237653, term237653.getClass(), "end", null);
        term237657 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term237657, term237657.getClass(), "tagName", "");
        setField(term237657, term237657.getClass(), "normalName", null);
        setField(term237657, term237657.getClass(), "pendingAttributeName", null);
        setField(term237657, term237657.getClass(), "pendingAttributeValue", null);
        setField(term237657, term237657.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term237657, term237657.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term237657, term237657.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term237657, term237657.getClass(), "selfClosing", false);
        setField(term237657, term237657.getClass(), "attributes", null);
        setField(term237657, term237657.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term237555;
        callMethod(klass, "popStackToClose", argTypes, term237175, args);
        assertTrue(recursiveEquals(term237175, term237653));
        assertTrue(recursiveEquals(term237555, term237657));
    }

};


