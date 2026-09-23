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

public class Element_appendNormalisedText_106893524369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6680;
     Object term6739;
     Object term6759;

    public Element_appendNormalisedText_106893524369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6702 = new HashMap();
        Set<Object> term6811 =  ((Map) term6702).keySet();
        HashSet term6701 = new HashSet((Collection<? extends Object>) term6811);
        ArrayList term6710 = new ArrayList();
        ((ArrayList) term6710).add((Object)null);
        ((ArrayList) term6710).add((Object)null);
        ((ArrayList) term6710).add((Object)null);
        LinkedHashMap term6715 = new LinkedHashMap();
        term6680 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6681 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6714 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6681, term6681.getClass(), "tagName", "BJklinBmhN");
        setBooleanField(term6681, term6681.getClass(), "isBlock", false);
        setBooleanField(term6681, term6681.getClass(), "formatAsBlock", true);
        setBooleanField(term6681, term6681.getClass(), "canContainBlock", false);
        setBooleanField(term6681, term6681.getClass(), "canContainInline", false);
        setBooleanField(term6681, term6681.getClass(), "empty", true);
        setBooleanField(term6681, term6681.getClass(), "selfClosing", true);
        setBooleanField(term6681, term6681.getClass(), "preserveWhitespace", true);
        setField(term6680, term6680.getClass(), "tag", term6681);
        setField(term6680, term6680.getClass(), "classNames", term6701);
        setField(term6680, term6680.getClass(), "parentNode", null);
        setField(term6680, term6680.getClass(), "childNodes", term6710);
        setField(term6714, term6714.getClass(), "attributes", term6715);
        setField(term6680, term6680.getClass(), "attributes", term6714);
        setField(term6680, term6680.getClass(), "baseUri", "BcENaQFYSd");
        setIntField(term6680, term6680.getClass(), "siblingIndex", 11724947);
        term6739 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6740 = (byte[]) newByteArray(16);
        setField(term6739, term6739.getClass(), "value", term6740);
        setByteField(term6739, term6739.getClass(), "coder", (byte) 89);
        setIntField(term6739, term6739.getClass(), "count", 1953277050);
        ArrayList term6772 = new ArrayList();
        ((ArrayList) term6772).add((Object)null);
        ((ArrayList) term6772).add((Object)null);
        ((ArrayList) term6772).add((Object)null);
        ((ArrayList) term6772).add((Object)null);
        ((ArrayList) term6772).add((Object)null);
        LinkedHashMap term6777 = new LinkedHashMap();
        term6759 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6776 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6759, term6759.getClass(), "text", "POPYycoDBy");
        setField(term6759, term6759.getClass(), "parentNode", null);
        setField(term6759, term6759.getClass(), "childNodes", term6772);
        setField(term6776, term6776.getClass(), "attributes", term6777);
        setField(term6759, term6759.getClass(), "attributes", term6776);
        setField(term6759, term6759.getClass(), "baseUri", "TVxGTjeDcu");
        setIntField(term6759, term6759.getClass(), "siblingIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6739;
        args[1] = term6759;
        callMethod(klass, "appendNormalisedText", argTypes, term6680, args);
    }

};


