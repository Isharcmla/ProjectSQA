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

public class Element_val_240623872127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6642;
     Object term52387;

    public Element_val_240623872127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6664 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6664, term6664.getClass(), "tagName", null);
        setBooleanField(term6664, term6664.getClass(), "isBlock", true);
        setBooleanField(term6664, term6664.getClass(), "canContainBlock", false);
        setBooleanField(term6664, term6664.getClass(), "canContainInline", false);
        setBooleanField(term6664, term6664.getClass(), "optionalClosing", false);
        setBooleanField(term6664, term6664.getClass(), "empty", false);
        setBooleanField(term6664, term6664.getClass(), "preserveWhitespace", false);
        setField(term6664, term6664.getClass(), "ancestors", null);
        Object term6671 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6671, term6671.getClass(), "tagName", null);
        setBooleanField(term6671, term6671.getClass(), "isBlock", true);
        setBooleanField(term6671, term6671.getClass(), "canContainBlock", false);
        setBooleanField(term6671, term6671.getClass(), "canContainInline", false);
        setBooleanField(term6671, term6671.getClass(), "optionalClosing", false);
        setBooleanField(term6671, term6671.getClass(), "empty", true);
        setBooleanField(term6671, term6671.getClass(), "preserveWhitespace", false);
        setField(term6671, term6671.getClass(), "ancestors", null);
        Object term6678 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6678, term6678.getClass(), "tagName", null);
        setBooleanField(term6678, term6678.getClass(), "isBlock", true);
        setBooleanField(term6678, term6678.getClass(), "canContainBlock", false);
        setBooleanField(term6678, term6678.getClass(), "canContainInline", false);
        setBooleanField(term6678, term6678.getClass(), "optionalClosing", true);
        setBooleanField(term6678, term6678.getClass(), "empty", false);
        setBooleanField(term6678, term6678.getClass(), "preserveWhitespace", true);
        setField(term6678, term6678.getClass(), "ancestors", null);
        ArrayList term6662 = new ArrayList();
        ((ArrayList) term6662).add(term6664);
        ((ArrayList) term6662).add(term6671);
        ((ArrayList) term6662).add(term6678);
        HashMap term6688 = new HashMap();
        Set<Object> term52414 =  ((Map) term6688).keySet();
        HashSet term6687 = new HashSet((Collection<? extends Object>) term52414);
        ArrayList term6708 = new ArrayList();
        ((ArrayList) term6708).add((Object)null);
        ((ArrayList) term6708).add((Object)null);
        LinkedHashMap term6713 = new LinkedHashMap();
        term6642 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6643 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6712 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6643, term6643.getClass(), "tagName", "gwTUlYNpjM");
        setBooleanField(term6643, term6643.getClass(), "isBlock", true);
        setBooleanField(term6643, term6643.getClass(), "canContainBlock", true);
        setBooleanField(term6643, term6643.getClass(), "canContainInline", true);
        setBooleanField(term6643, term6643.getClass(), "optionalClosing", false);
        setBooleanField(term6643, term6643.getClass(), "empty", false);
        setBooleanField(term6643, term6643.getClass(), "preserveWhitespace", false);
        setField(term6643, term6643.getClass(), "ancestors", term6662);
        setField(term6642, term6642.getClass(), "tag", term6643);
        setField(term6642, term6642.getClass(), "classNames", term6687);
        setField(term6642, term6642.getClass(), "parentNode", null);
        setField(term6642, term6642.getClass(), "childNodes", term6708);
        setField(term6712, term6712.getClass(), "attributes", term6713);
        setField(term6642, term6642.getClass(), "attributes", term6712);
        setField(term6642, term6642.getClass(), "baseUri", "gZPZNkweEp");
        Object term52393 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52393, term52393.getClass(), "tagName", null);
        setBooleanField(term52393, term52393.getClass(), "isBlock", true);
        setBooleanField(term52393, term52393.getClass(), "canContainBlock", false);
        setBooleanField(term52393, term52393.getClass(), "canContainInline", false);
        setBooleanField(term52393, term52393.getClass(), "optionalClosing", false);
        setBooleanField(term52393, term52393.getClass(), "empty", false);
        setBooleanField(term52393, term52393.getClass(), "preserveWhitespace", false);
        setField(term52393, term52393.getClass(), "ancestors", null);
        Object term52394 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52394, term52394.getClass(), "tagName", null);
        setBooleanField(term52394, term52394.getClass(), "isBlock", true);
        setBooleanField(term52394, term52394.getClass(), "canContainBlock", false);
        setBooleanField(term52394, term52394.getClass(), "canContainInline", false);
        setBooleanField(term52394, term52394.getClass(), "optionalClosing", false);
        setBooleanField(term52394, term52394.getClass(), "empty", true);
        setBooleanField(term52394, term52394.getClass(), "preserveWhitespace", false);
        setField(term52394, term52394.getClass(), "ancestors", null);
        Object term52395 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52395, term52395.getClass(), "tagName", null);
        setBooleanField(term52395, term52395.getClass(), "isBlock", true);
        setBooleanField(term52395, term52395.getClass(), "canContainBlock", false);
        setBooleanField(term52395, term52395.getClass(), "canContainInline", false);
        setBooleanField(term52395, term52395.getClass(), "optionalClosing", true);
        setBooleanField(term52395, term52395.getClass(), "empty", false);
        setBooleanField(term52395, term52395.getClass(), "preserveWhitespace", true);
        setField(term52395, term52395.getClass(), "ancestors", null);
        ArrayList term52391 = new ArrayList();
        ((ArrayList) term52391).add(term52393);
        ((ArrayList) term52391).add(term52394);
        ((ArrayList) term52391).add(term52395);
        HashMap term52397 = new HashMap();
        Set<Object> term52435 =  ((Map) term52397).keySet();
        HashSet term52396 = new HashSet((Collection<? extends Object>) term52435);
        ArrayList term52398 = new ArrayList();
        ((ArrayList) term52398).add((Object)null);
        ((ArrayList) term52398).add((Object)null);
        LinkedHashMap term52401 = new LinkedHashMap();
        term52387 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term52388 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term52400 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term52388, term52388.getClass(), "tagName", "gwTUlYNpjM");
        setBooleanField(term52388, term52388.getClass(), "isBlock", true);
        setBooleanField(term52388, term52388.getClass(), "canContainBlock", true);
        setBooleanField(term52388, term52388.getClass(), "canContainInline", true);
        setBooleanField(term52388, term52388.getClass(), "optionalClosing", false);
        setBooleanField(term52388, term52388.getClass(), "empty", false);
        setBooleanField(term52388, term52388.getClass(), "preserveWhitespace", false);
        setField(term52388, term52388.getClass(), "ancestors", term52391);
        setField(term52387, term52387.getClass(), "tag", term52388);
        setField(term52387, term52387.getClass(), "classNames", term52396);
        setField(term52387, term52387.getClass(), "parentNode", null);
        setField(term52387, term52387.getClass(), "childNodes", term52398);
        setField(term52400, term52400.getClass(), "attributes", term52401);
        setField(term52387, term52387.getClass(), "attributes", term52400);
        setField(term52387, term52387.getClass(), "baseUri", "gZPZNkweEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "val", argTypes, term6642, args);
        assertTrue(recursiveEquals(term6642, term52387));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


