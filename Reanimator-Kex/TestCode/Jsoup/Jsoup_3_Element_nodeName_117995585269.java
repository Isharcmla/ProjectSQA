package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_nodeName_117995585269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term8230;

    public Element_nodeName_117995585269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term250 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term250, term250.getClass(), "tagName", null);
        setBooleanField(term250, term250.getClass(), "isBlock", true);
        setBooleanField(term250, term250.getClass(), "canContainBlock", false);
        setBooleanField(term250, term250.getClass(), "canContainInline", false);
        setBooleanField(term250, term250.getClass(), "optionalClosing", true);
        setBooleanField(term250, term250.getClass(), "empty", true);
        setBooleanField(term250, term250.getClass(), "preserveWhitespace", false);
        setField(term250, term250.getClass(), "ancestors", null);
        Object term257 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term257, term257.getClass(), "tagName", null);
        setBooleanField(term257, term257.getClass(), "isBlock", false);
        setBooleanField(term257, term257.getClass(), "canContainBlock", false);
        setBooleanField(term257, term257.getClass(), "canContainInline", true);
        setBooleanField(term257, term257.getClass(), "optionalClosing", true);
        setBooleanField(term257, term257.getClass(), "empty", false);
        setBooleanField(term257, term257.getClass(), "preserveWhitespace", true);
        setField(term257, term257.getClass(), "ancestors", null);
        ArrayList term248 = new ArrayList();
        ((ArrayList) term248).add(term250);
        ((ArrayList) term248).add(term257);
        HashMap term267 = new HashMap();
        Set<Object> term8256 =  ((Map) term267).keySet();
        HashSet term266 = new HashSet((Collection<? extends Object>) term8256);
        ArrayList term277 = new ArrayList();
        ((ArrayList) term277).add((Object)null);
        ((ArrayList) term277).add((Object)null);
        ((ArrayList) term277).add((Object)null);
        ((ArrayList) term277).add((Object)null);
        ((ArrayList) term277).add((Object)null);
        ((ArrayList) term277).add((Object)null);
        LinkedHashMap term282 = new LinkedHashMap();
        term228 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term229 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term281 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term229, term229.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term229, term229.getClass(), "isBlock", false);
        setBooleanField(term229, term229.getClass(), "canContainBlock", false);
        setBooleanField(term229, term229.getClass(), "canContainInline", false);
        setBooleanField(term229, term229.getClass(), "optionalClosing", false);
        setBooleanField(term229, term229.getClass(), "empty", false);
        setBooleanField(term229, term229.getClass(), "preserveWhitespace", false);
        setField(term229, term229.getClass(), "ancestors", term248);
        setField(term228, term228.getClass(), "tag", term229);
        setField(term228, term228.getClass(), "classNames", term266);
        setField(term228, term228.getClass(), "parentNode", null);
        setField(term228, term228.getClass(), "childNodes", term277);
        setField(term281, term281.getClass(), "attributes", term282);
        setField(term228, term228.getClass(), "attributes", term281);
        setField(term228, term228.getClass(), "baseUri", "SbAoxhfrkn");
        Object term8236 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8236, term8236.getClass(), "tagName", null);
        setBooleanField(term8236, term8236.getClass(), "isBlock", true);
        setBooleanField(term8236, term8236.getClass(), "canContainBlock", false);
        setBooleanField(term8236, term8236.getClass(), "canContainInline", false);
        setBooleanField(term8236, term8236.getClass(), "optionalClosing", true);
        setBooleanField(term8236, term8236.getClass(), "empty", true);
        setBooleanField(term8236, term8236.getClass(), "preserveWhitespace", false);
        setField(term8236, term8236.getClass(), "ancestors", null);
        Object term8237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8237, term8237.getClass(), "tagName", null);
        setBooleanField(term8237, term8237.getClass(), "isBlock", false);
        setBooleanField(term8237, term8237.getClass(), "canContainBlock", false);
        setBooleanField(term8237, term8237.getClass(), "canContainInline", true);
        setBooleanField(term8237, term8237.getClass(), "optionalClosing", true);
        setBooleanField(term8237, term8237.getClass(), "empty", false);
        setBooleanField(term8237, term8237.getClass(), "preserveWhitespace", true);
        setField(term8237, term8237.getClass(), "ancestors", null);
        ArrayList term8234 = new ArrayList();
        ((ArrayList) term8234).add(term8236);
        ((ArrayList) term8234).add(term8237);
        HashMap term8239 = new HashMap();
        Set<Object> term8277 =  ((Map) term8239).keySet();
        HashSet term8238 = new HashSet((Collection<? extends Object>) term8277);
        ArrayList term8240 = new ArrayList();
        ((ArrayList) term8240).add((Object)null);
        ((ArrayList) term8240).add((Object)null);
        ((ArrayList) term8240).add((Object)null);
        ((ArrayList) term8240).add((Object)null);
        ((ArrayList) term8240).add((Object)null);
        ((ArrayList) term8240).add((Object)null);
        LinkedHashMap term8243 = new LinkedHashMap();
        term8230 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8231 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8242 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8231, term8231.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term8231, term8231.getClass(), "isBlock", false);
        setBooleanField(term8231, term8231.getClass(), "canContainBlock", false);
        setBooleanField(term8231, term8231.getClass(), "canContainInline", false);
        setBooleanField(term8231, term8231.getClass(), "optionalClosing", false);
        setBooleanField(term8231, term8231.getClass(), "empty", false);
        setBooleanField(term8231, term8231.getClass(), "preserveWhitespace", false);
        setField(term8231, term8231.getClass(), "ancestors", term8234);
        setField(term8230, term8230.getClass(), "tag", term8231);
        setField(term8230, term8230.getClass(), "classNames", term8238);
        setField(term8230, term8230.getClass(), "parentNode", null);
        setField(term8230, term8230.getClass(), "childNodes", term8240);
        setField(term8242, term8242.getClass(), "attributes", term8243);
        setField(term8230, term8230.getClass(), "attributes", term8242);
        setField(term8230, term8230.getClass(), "baseUri", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term228, args);
        assertTrue(recursiveEquals(term228, term8230));
        assertTrue(recursiveEquals(retValue, "xOEqzGAmDU"));
    }

};


