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
import java.lang.Integer;

public class Element_getElementsByIndexLessThan_751556693110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4645;
     Object term4719;
     Object term48746;
     Object term48741;

    public Element_getElementsByIndexLessThan_751556693110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4667 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4667, term4667.getClass(), "tagName", null);
        setBooleanField(term4667, term4667.getClass(), "isBlock", true);
        setBooleanField(term4667, term4667.getClass(), "canContainBlock", true);
        setBooleanField(term4667, term4667.getClass(), "canContainInline", true);
        setBooleanField(term4667, term4667.getClass(), "optionalClosing", true);
        setBooleanField(term4667, term4667.getClass(), "empty", false);
        setBooleanField(term4667, term4667.getClass(), "preserveWhitespace", true);
        setField(term4667, term4667.getClass(), "ancestors", null);
        Object term4674 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4674, term4674.getClass(), "tagName", null);
        setBooleanField(term4674, term4674.getClass(), "isBlock", false);
        setBooleanField(term4674, term4674.getClass(), "canContainBlock", true);
        setBooleanField(term4674, term4674.getClass(), "canContainInline", true);
        setBooleanField(term4674, term4674.getClass(), "optionalClosing", true);
        setBooleanField(term4674, term4674.getClass(), "empty", false);
        setBooleanField(term4674, term4674.getClass(), "preserveWhitespace", true);
        setField(term4674, term4674.getClass(), "ancestors", null);
        ArrayList term4665 = new ArrayList();
        ((ArrayList) term4665).add(term4667);
        ((ArrayList) term4665).add(term4674);
        HashMap term4684 = new HashMap();
        Set<Object> term48762 =  ((Map) term4684).keySet();
        HashSet term4683 = new HashSet((Collection<? extends Object>) term48762);
        ArrayList term4696 = new ArrayList();
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        ((ArrayList) term4696).add((Object)null);
        LinkedHashMap term4701 = new LinkedHashMap();
        term4645 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4646 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4700 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4646, term4646.getClass(), "tagName", "IVacFDAZcj");
        setBooleanField(term4646, term4646.getClass(), "isBlock", false);
        setBooleanField(term4646, term4646.getClass(), "canContainBlock", false);
        setBooleanField(term4646, term4646.getClass(), "canContainInline", true);
        setBooleanField(term4646, term4646.getClass(), "optionalClosing", false);
        setBooleanField(term4646, term4646.getClass(), "empty", true);
        setBooleanField(term4646, term4646.getClass(), "preserveWhitespace", false);
        setField(term4646, term4646.getClass(), "ancestors", term4665);
        setField(term4645, term4645.getClass(), "tag", term4646);
        setField(term4645, term4645.getClass(), "classNames", term4683);
        setField(term4645, term4645.getClass(), "parentNode", null);
        setField(term4645, term4645.getClass(), "childNodes", term4696);
        setField(term4700, term4700.getClass(), "attributes", term4701);
        setField(term4645, term4645.getClass(), "attributes", term4700);
        setField(term4645, term4645.getClass(), "baseUri", "OwPIiBRuKK");
        term4719 = new Integer(1162663216);
        HashSet term48748 = new HashSet();
        ArrayList term48749 = new ArrayList();
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        ((ArrayList) term48749).add((Object)null);
        term48746 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term48747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term48750 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term48747, term48747.getClass(), "tagName", null);
        setBooleanField(term48747, term48747.getClass(), "isBlock", false);
        setBooleanField(term48747, term48747.getClass(), "canContainBlock", false);
        setBooleanField(term48747, term48747.getClass(), "canContainInline", true);
        setBooleanField(term48747, term48747.getClass(), "optionalClosing", false);
        setBooleanField(term48747, term48747.getClass(), "empty", true);
        setBooleanField(term48747, term48747.getClass(), "preserveWhitespace", false);
        setField(term48747, term48747.getClass(), "ancestors", null);
        setField(term48746, term48746.getClass(), "tag", term48747);
        setField(term48746, term48746.getClass(), "classNames", term48748);
        setField(term48746, term48746.getClass(), "parentNode", null);
        setField(term48746, term48746.getClass(), "childNodes", term48749);
        setField(term48750, term48750.getClass(), "attributes", null);
        setField(term48746, term48746.getClass(), "attributes", term48750);
        setField(term48746, term48746.getClass(), "baseUri", "");
        HashSet term48677 = new HashSet();
        ArrayList term48678 = new ArrayList();
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        ((ArrayList) term48678).add((Object)null);
        Object term48669 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term48670 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term48681 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term48670, term48670.getClass(), "tagName", null);
        setBooleanField(term48670, term48670.getClass(), "isBlock", false);
        setBooleanField(term48670, term48670.getClass(), "canContainBlock", false);
        setBooleanField(term48670, term48670.getClass(), "canContainInline", true);
        setBooleanField(term48670, term48670.getClass(), "optionalClosing", false);
        setBooleanField(term48670, term48670.getClass(), "empty", true);
        setBooleanField(term48670, term48670.getClass(), "preserveWhitespace", false);
        setField(term48670, term48670.getClass(), "ancestors", null);
        setField(term48669, term48669.getClass(), "tag", term48670);
        setField(term48669, term48669.getClass(), "classNames", term48677);
        setField(term48669, term48669.getClass(), "parentNode", null);
        setField(term48669, term48669.getClass(), "childNodes", term48678);
        setField(term48681, term48681.getClass(), "attributes", null);
        setField(term48669, term48669.getClass(), "attributes", term48681);
        setField(term48669, term48669.getClass(), "baseUri", "");
        ArrayList term48742 = new ArrayList();
        ((ArrayList) term48742).add(term48669);
        term48741 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term48741, term48741.getClass(), "contents", term48742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4719;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term4645, args);
        assertTrue(recursiveEquals(term4645, term48746));
        assertTrue(recursiveEquals(term4719, 1162663216));
        assertTrue(recursiveEquals(retValue, term48741));
    }

};


