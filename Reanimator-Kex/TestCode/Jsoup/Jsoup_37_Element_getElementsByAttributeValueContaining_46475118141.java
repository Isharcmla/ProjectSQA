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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueContaining_46475118141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4661;
     Object term26690;
     Object term26685;

    public Element_getElementsByAttributeValueContaining_46475118141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4685 = new HashMap();
        Set<Object> term26716 =  ((Map) term4685).keySet();
        HashSet term4684 = new HashSet((Collection<? extends Object>) term26716);
        ArrayList term4705 = new ArrayList();
        ((ArrayList) term4705).add((Object)null);
        ((ArrayList) term4705).add((Object)null);
        ((ArrayList) term4705).add((Object)null);
        ((ArrayList) term4705).add((Object)null);
        ((ArrayList) term4705).add((Object)null);
        LinkedHashMap term4710 = new LinkedHashMap();
        term4661 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4662 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4709 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4662, term4662.getClass(), "tagName", "goAoCMhKBu");
        setBooleanField(term4662, term4662.getClass(), "isBlock", false);
        setBooleanField(term4662, term4662.getClass(), "formatAsBlock", false);
        setBooleanField(term4662, term4662.getClass(), "canContainBlock", false);
        setBooleanField(term4662, term4662.getClass(), "canContainInline", true);
        setBooleanField(term4662, term4662.getClass(), "empty", true);
        setBooleanField(term4662, term4662.getClass(), "selfClosing", false);
        setBooleanField(term4662, term4662.getClass(), "preserveWhitespace", true);
        setBooleanField(term4662, term4662.getClass(), "formList", true);
        setBooleanField(term4662, term4662.getClass(), "formSubmit", false);
        setField(term4661, term4661.getClass(), "tag", term4662);
        setField(term4661, term4661.getClass(), "classNames", term4684);
        setField(term4661, term4661.getClass(), "parentNode", null);
        setField(term4661, term4661.getClass(), "childNodes", term4705);
        setField(term4709, term4709.getClass(), "attributes", term4710);
        setField(term4661, term4661.getClass(), "attributes", term4709);
        setField(term4661, term4661.getClass(), "baseUri", "GeddnXjHGy");
        setIntField(term4661, term4661.getClass(), "siblingIndex", -14890619);
        HashMap term26695 = new HashMap();
        Set<Object> term26757 =  ((Map) term26695).keySet();
        HashSet term26694 = new HashSet((Collection<? extends Object>) term26757);
        ArrayList term26696 = new ArrayList();
        ((ArrayList) term26696).add((Object)null);
        ((ArrayList) term26696).add((Object)null);
        ((ArrayList) term26696).add((Object)null);
        ((ArrayList) term26696).add((Object)null);
        ((ArrayList) term26696).add((Object)null);
        LinkedHashMap term26699 = new LinkedHashMap();
        term26690 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26698 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26691, term26691.getClass(), "tagName", "goAoCMhKBu");
        setBooleanField(term26691, term26691.getClass(), "isBlock", false);
        setBooleanField(term26691, term26691.getClass(), "formatAsBlock", false);
        setBooleanField(term26691, term26691.getClass(), "canContainBlock", false);
        setBooleanField(term26691, term26691.getClass(), "canContainInline", true);
        setBooleanField(term26691, term26691.getClass(), "empty", true);
        setBooleanField(term26691, term26691.getClass(), "selfClosing", false);
        setBooleanField(term26691, term26691.getClass(), "preserveWhitespace", true);
        setBooleanField(term26691, term26691.getClass(), "formList", true);
        setBooleanField(term26691, term26691.getClass(), "formSubmit", false);
        setField(term26690, term26690.getClass(), "tag", term26691);
        setField(term26690, term26690.getClass(), "classNames", term26694);
        setField(term26690, term26690.getClass(), "parentNode", null);
        setField(term26690, term26690.getClass(), "childNodes", term26696);
        setField(term26698, term26698.getClass(), "attributes", term26699);
        setField(term26690, term26690.getClass(), "attributes", term26698);
        setField(term26690, term26690.getClass(), "baseUri", "GeddnXjHGy");
        setIntField(term26690, term26690.getClass(), "siblingIndex", -14890619);
        ArrayList term26686 = new ArrayList();
        term26685 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term26685, term26685.getClass(), "contents", term26686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "vLTbaoAxBm";
        args[1] = "BXTjEyEZxD";
        Object retValue = callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4661, args);
        assertTrue(recursiveEquals(term4661, term26690));
        assertTrue(recursiveEquals(retValue, term26685));
    }

};


