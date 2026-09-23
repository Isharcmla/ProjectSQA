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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueContaining_4647511848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4619;

    public Element_getElementsByAttributeValueContaining_4647511848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4641 = new HashMap();
        Set<Object> term4724 =  ((Map) term4641).keySet();
        HashSet term4640 = new HashSet((Collection<? extends Object>) term4724);
        ArrayList term4661 = new ArrayList();
        ((ArrayList) term4661).add((Object)null);
        ((ArrayList) term4661).add((Object)null);
        ((ArrayList) term4661).add((Object)null);
        ((ArrayList) term4661).add((Object)null);
        ((ArrayList) term4661).add((Object)null);
        LinkedHashMap term4666 = new LinkedHashMap();
        term4619 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4620 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4665 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4620, term4620.getClass(), "tagName", "goAoCMhKBu");
        setBooleanField(term4620, term4620.getClass(), "isBlock", true);
        setBooleanField(term4620, term4620.getClass(), "formatAsBlock", true);
        setBooleanField(term4620, term4620.getClass(), "canContainBlock", false);
        setBooleanField(term4620, term4620.getClass(), "canContainInline", true);
        setBooleanField(term4620, term4620.getClass(), "empty", true);
        setBooleanField(term4620, term4620.getClass(), "selfClosing", true);
        setBooleanField(term4620, term4620.getClass(), "preserveWhitespace", false);
        setField(term4619, term4619.getClass(), "tag", term4620);
        setField(term4619, term4619.getClass(), "classNames", term4640);
        setField(term4619, term4619.getClass(), "parentNode", null);
        setField(term4619, term4619.getClass(), "childNodes", term4661);
        setField(term4665, term4665.getClass(), "attributes", term4666);
        setField(term4619, term4619.getClass(), "attributes", term4665);
        setField(term4619, term4619.getClass(), "baseUri", "GeddnXjHGy");
        setIntField(term4619, term4619.getClass(), "siblingIndex", 579005622);
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
        callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4619, args);
    }

};


