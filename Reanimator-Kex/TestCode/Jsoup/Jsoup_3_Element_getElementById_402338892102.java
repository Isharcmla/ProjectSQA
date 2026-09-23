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

public class Element_getElementById_402338892102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;
     Object term46619;

    public Element_getElementById_402338892102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3540 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3540, term3540.getClass(), "tagName", null);
        setBooleanField(term3540, term3540.getClass(), "isBlock", false);
        setBooleanField(term3540, term3540.getClass(), "canContainBlock", true);
        setBooleanField(term3540, term3540.getClass(), "canContainInline", true);
        setBooleanField(term3540, term3540.getClass(), "optionalClosing", false);
        setBooleanField(term3540, term3540.getClass(), "empty", false);
        setBooleanField(term3540, term3540.getClass(), "preserveWhitespace", false);
        setField(term3540, term3540.getClass(), "ancestors", null);
        Object term3547 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3547, term3547.getClass(), "tagName", null);
        setBooleanField(term3547, term3547.getClass(), "isBlock", true);
        setBooleanField(term3547, term3547.getClass(), "canContainBlock", true);
        setBooleanField(term3547, term3547.getClass(), "canContainInline", false);
        setBooleanField(term3547, term3547.getClass(), "optionalClosing", true);
        setBooleanField(term3547, term3547.getClass(), "empty", false);
        setBooleanField(term3547, term3547.getClass(), "preserveWhitespace", false);
        setField(term3547, term3547.getClass(), "ancestors", null);
        Object term3554 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3554, term3554.getClass(), "tagName", null);
        setBooleanField(term3554, term3554.getClass(), "isBlock", false);
        setBooleanField(term3554, term3554.getClass(), "canContainBlock", false);
        setBooleanField(term3554, term3554.getClass(), "canContainInline", false);
        setBooleanField(term3554, term3554.getClass(), "optionalClosing", false);
        setBooleanField(term3554, term3554.getClass(), "empty", false);
        setBooleanField(term3554, term3554.getClass(), "preserveWhitespace", false);
        setField(term3554, term3554.getClass(), "ancestors", null);
        Object term3561 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3561, term3561.getClass(), "tagName", null);
        setBooleanField(term3561, term3561.getClass(), "isBlock", false);
        setBooleanField(term3561, term3561.getClass(), "canContainBlock", false);
        setBooleanField(term3561, term3561.getClass(), "canContainInline", true);
        setBooleanField(term3561, term3561.getClass(), "optionalClosing", true);
        setBooleanField(term3561, term3561.getClass(), "empty", true);
        setBooleanField(term3561, term3561.getClass(), "preserveWhitespace", true);
        setField(term3561, term3561.getClass(), "ancestors", null);
        ArrayList term3538 = new ArrayList();
        ((ArrayList) term3538).add(term3540);
        ((ArrayList) term3538).add(term3547);
        ((ArrayList) term3538).add(term3554);
        ((ArrayList) term3538).add(term3561);
        HashMap term3571 = new HashMap();
        Set<Object> term46649 =  ((Map) term3571).keySet();
        HashSet term3570 = new HashSet((Collection<? extends Object>) term46649);
        ArrayList term3583 = new ArrayList();
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        ((ArrayList) term3583).add((Object)null);
        LinkedHashMap term3588 = new LinkedHashMap();
        term3518 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3519 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3519, term3519.getClass(), "tagName", "fIZsWucfXz");
        setBooleanField(term3519, term3519.getClass(), "isBlock", true);
        setBooleanField(term3519, term3519.getClass(), "canContainBlock", true);
        setBooleanField(term3519, term3519.getClass(), "canContainInline", false);
        setBooleanField(term3519, term3519.getClass(), "optionalClosing", false);
        setBooleanField(term3519, term3519.getClass(), "empty", false);
        setBooleanField(term3519, term3519.getClass(), "preserveWhitespace", false);
        setField(term3519, term3519.getClass(), "ancestors", term3538);
        setField(term3518, term3518.getClass(), "tag", term3519);
        setField(term3518, term3518.getClass(), "classNames", term3570);
        setField(term3518, term3518.getClass(), "parentNode", null);
        setField(term3518, term3518.getClass(), "childNodes", term3583);
        setField(term3587, term3587.getClass(), "attributes", term3588);
        setField(term3518, term3518.getClass(), "attributes", term3587);
        setField(term3518, term3518.getClass(), "baseUri", "wsysQLGFnl");
        Object term46625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46625, term46625.getClass(), "tagName", null);
        setBooleanField(term46625, term46625.getClass(), "isBlock", false);
        setBooleanField(term46625, term46625.getClass(), "canContainBlock", true);
        setBooleanField(term46625, term46625.getClass(), "canContainInline", true);
        setBooleanField(term46625, term46625.getClass(), "optionalClosing", false);
        setBooleanField(term46625, term46625.getClass(), "empty", false);
        setBooleanField(term46625, term46625.getClass(), "preserveWhitespace", false);
        setField(term46625, term46625.getClass(), "ancestors", null);
        Object term46626 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46626, term46626.getClass(), "tagName", null);
        setBooleanField(term46626, term46626.getClass(), "isBlock", true);
        setBooleanField(term46626, term46626.getClass(), "canContainBlock", true);
        setBooleanField(term46626, term46626.getClass(), "canContainInline", false);
        setBooleanField(term46626, term46626.getClass(), "optionalClosing", true);
        setBooleanField(term46626, term46626.getClass(), "empty", false);
        setBooleanField(term46626, term46626.getClass(), "preserveWhitespace", false);
        setField(term46626, term46626.getClass(), "ancestors", null);
        Object term46627 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46627, term46627.getClass(), "tagName", null);
        setBooleanField(term46627, term46627.getClass(), "isBlock", false);
        setBooleanField(term46627, term46627.getClass(), "canContainBlock", false);
        setBooleanField(term46627, term46627.getClass(), "canContainInline", false);
        setBooleanField(term46627, term46627.getClass(), "optionalClosing", false);
        setBooleanField(term46627, term46627.getClass(), "empty", false);
        setBooleanField(term46627, term46627.getClass(), "preserveWhitespace", false);
        setField(term46627, term46627.getClass(), "ancestors", null);
        Object term46628 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46628, term46628.getClass(), "tagName", null);
        setBooleanField(term46628, term46628.getClass(), "isBlock", false);
        setBooleanField(term46628, term46628.getClass(), "canContainBlock", false);
        setBooleanField(term46628, term46628.getClass(), "canContainInline", true);
        setBooleanField(term46628, term46628.getClass(), "optionalClosing", true);
        setBooleanField(term46628, term46628.getClass(), "empty", true);
        setBooleanField(term46628, term46628.getClass(), "preserveWhitespace", true);
        setField(term46628, term46628.getClass(), "ancestors", null);
        ArrayList term46623 = new ArrayList();
        ((ArrayList) term46623).add(term46625);
        ((ArrayList) term46623).add(term46626);
        ((ArrayList) term46623).add(term46627);
        ((ArrayList) term46623).add(term46628);
        HashMap term46630 = new HashMap();
        Set<Object> term46680 =  ((Map) term46630).keySet();
        HashSet term46629 = new HashSet((Collection<? extends Object>) term46680);
        ArrayList term46631 = new ArrayList();
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        ((ArrayList) term46631).add((Object)null);
        LinkedHashMap term46634 = new LinkedHashMap();
        term46619 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term46620 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term46633 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term46620, term46620.getClass(), "tagName", "fIZsWucfXz");
        setBooleanField(term46620, term46620.getClass(), "isBlock", true);
        setBooleanField(term46620, term46620.getClass(), "canContainBlock", true);
        setBooleanField(term46620, term46620.getClass(), "canContainInline", false);
        setBooleanField(term46620, term46620.getClass(), "optionalClosing", false);
        setBooleanField(term46620, term46620.getClass(), "empty", false);
        setBooleanField(term46620, term46620.getClass(), "preserveWhitespace", false);
        setField(term46620, term46620.getClass(), "ancestors", term46623);
        setField(term46619, term46619.getClass(), "tag", term46620);
        setField(term46619, term46619.getClass(), "classNames", term46629);
        setField(term46619, term46619.getClass(), "parentNode", null);
        setField(term46619, term46619.getClass(), "childNodes", term46631);
        setField(term46633, term46633.getClass(), "attributes", term46634);
        setField(term46619, term46619.getClass(), "attributes", term46633);
        setField(term46619, term46619.getClass(), "baseUri", "wsysQLGFnl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ckQLZGFjMX";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3518, args);
        assertTrue(recursiveEquals(term3518, term46619));
        assertTrue(recursiveEquals(retValue, null));
    }

};


