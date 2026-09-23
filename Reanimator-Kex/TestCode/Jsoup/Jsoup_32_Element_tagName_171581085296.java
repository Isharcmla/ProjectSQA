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

public class Element_tagName_171581085296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term9672;

    public Element_tagName_171581085296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term238 = new HashMap();
        Set<Object> term9694 =  ((Map) term238).keySet();
        HashSet term237 = new HashSet((Collection<? extends Object>) term9694);
        ArrayList term250 = new ArrayList();
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        LinkedHashMap term255 = new LinkedHashMap();
        term216 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term217 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term254 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term217, term217.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term217, term217.getClass(), "isBlock", true);
        setBooleanField(term217, term217.getClass(), "formatAsBlock", true);
        setBooleanField(term217, term217.getClass(), "canContainBlock", true);
        setBooleanField(term217, term217.getClass(), "canContainInline", true);
        setBooleanField(term217, term217.getClass(), "empty", false);
        setBooleanField(term217, term217.getClass(), "selfClosing", false);
        setBooleanField(term217, term217.getClass(), "preserveWhitespace", false);
        setField(term216, term216.getClass(), "tag", term217);
        setField(term216, term216.getClass(), "classNames", term237);
        setField(term216, term216.getClass(), "parentNode", null);
        setField(term216, term216.getClass(), "childNodes", term250);
        setField(term254, term254.getClass(), "attributes", term255);
        setField(term216, term216.getClass(), "attributes", term254);
        setField(term216, term216.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term216, term216.getClass(), "siblingIndex", 1162663216);
        HashMap term9677 = new HashMap();
        Set<Object> term9715 =  ((Map) term9677).keySet();
        HashSet term9676 = new HashSet((Collection<? extends Object>) term9715);
        ArrayList term9678 = new ArrayList();
        ((ArrayList) term9678).add((Object)null);
        ((ArrayList) term9678).add((Object)null);
        ((ArrayList) term9678).add((Object)null);
        ((ArrayList) term9678).add((Object)null);
        LinkedHashMap term9681 = new LinkedHashMap();
        term9672 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9673 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9680 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9673, term9673.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term9673, term9673.getClass(), "isBlock", true);
        setBooleanField(term9673, term9673.getClass(), "formatAsBlock", true);
        setBooleanField(term9673, term9673.getClass(), "canContainBlock", true);
        setBooleanField(term9673, term9673.getClass(), "canContainInline", true);
        setBooleanField(term9673, term9673.getClass(), "empty", false);
        setBooleanField(term9673, term9673.getClass(), "selfClosing", false);
        setBooleanField(term9673, term9673.getClass(), "preserveWhitespace", false);
        setField(term9672, term9672.getClass(), "tag", term9673);
        setField(term9672, term9672.getClass(), "classNames", term9676);
        setField(term9672, term9672.getClass(), "parentNode", null);
        setField(term9672, term9672.getClass(), "childNodes", term9678);
        setField(term9680, term9680.getClass(), "attributes", term9681);
        setField(term9672, term9672.getClass(), "attributes", term9680);
        setField(term9672, term9672.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term9672, term9672.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term216, args);
        assertTrue(recursiveEquals(term216, term9672));
        assertTrue(recursiveEquals(retValue, "tbcdzjIfER"));
    }

};


