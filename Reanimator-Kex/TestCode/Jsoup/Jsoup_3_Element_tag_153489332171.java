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

public class Element_tag_153489332171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;
     Object term8606;
     Object term8539;

    public Element_tag_153489332171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term465 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term465, term465.getClass(), "tagName", null);
        setBooleanField(term465, term465.getClass(), "isBlock", false);
        setBooleanField(term465, term465.getClass(), "canContainBlock", true);
        setBooleanField(term465, term465.getClass(), "canContainInline", false);
        setBooleanField(term465, term465.getClass(), "optionalClosing", false);
        setBooleanField(term465, term465.getClass(), "empty", true);
        setBooleanField(term465, term465.getClass(), "preserveWhitespace", false);
        setField(term465, term465.getClass(), "ancestors", null);
        Object term472 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term472, term472.getClass(), "tagName", null);
        setBooleanField(term472, term472.getClass(), "isBlock", false);
        setBooleanField(term472, term472.getClass(), "canContainBlock", false);
        setBooleanField(term472, term472.getClass(), "canContainInline", false);
        setBooleanField(term472, term472.getClass(), "optionalClosing", false);
        setBooleanField(term472, term472.getClass(), "empty", false);
        setBooleanField(term472, term472.getClass(), "preserveWhitespace", false);
        setField(term472, term472.getClass(), "ancestors", null);
        ArrayList term463 = new ArrayList();
        ((ArrayList) term463).add(term465);
        ((ArrayList) term463).add(term472);
        HashMap term482 = new HashMap();
        Set<Object> term8632 =  ((Map) term482).keySet();
        HashSet term481 = new HashSet((Collection<? extends Object>) term8632);
        ArrayList term492 = new ArrayList();
        ((ArrayList) term492).add((Object)null);
        ((ArrayList) term492).add((Object)null);
        ((ArrayList) term492).add((Object)null);
        ((ArrayList) term492).add((Object)null);
        ((ArrayList) term492).add((Object)null);
        LinkedHashMap term497 = new LinkedHashMap();
        term443 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term444 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term496 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term444, term444.getClass(), "tagName", "JDswTTCZHV");
        setBooleanField(term444, term444.getClass(), "isBlock", true);
        setBooleanField(term444, term444.getClass(), "canContainBlock", true);
        setBooleanField(term444, term444.getClass(), "canContainInline", true);
        setBooleanField(term444, term444.getClass(), "optionalClosing", true);
        setBooleanField(term444, term444.getClass(), "empty", true);
        setBooleanField(term444, term444.getClass(), "preserveWhitespace", false);
        setField(term444, term444.getClass(), "ancestors", term463);
        setField(term443, term443.getClass(), "tag", term444);
        setField(term443, term443.getClass(), "classNames", term481);
        setField(term443, term443.getClass(), "parentNode", null);
        setField(term443, term443.getClass(), "childNodes", term492);
        setField(term496, term496.getClass(), "attributes", term497);
        setField(term443, term443.getClass(), "attributes", term496);
        setField(term443, term443.getClass(), "baseUri", "fhkbdRViHi");
        Object term8612 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8612, term8612.getClass(), "tagName", null);
        setBooleanField(term8612, term8612.getClass(), "isBlock", false);
        setBooleanField(term8612, term8612.getClass(), "canContainBlock", true);
        setBooleanField(term8612, term8612.getClass(), "canContainInline", false);
        setBooleanField(term8612, term8612.getClass(), "optionalClosing", false);
        setBooleanField(term8612, term8612.getClass(), "empty", true);
        setBooleanField(term8612, term8612.getClass(), "preserveWhitespace", false);
        setField(term8612, term8612.getClass(), "ancestors", null);
        Object term8613 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8613, term8613.getClass(), "tagName", null);
        setBooleanField(term8613, term8613.getClass(), "isBlock", false);
        setBooleanField(term8613, term8613.getClass(), "canContainBlock", false);
        setBooleanField(term8613, term8613.getClass(), "canContainInline", false);
        setBooleanField(term8613, term8613.getClass(), "optionalClosing", false);
        setBooleanField(term8613, term8613.getClass(), "empty", false);
        setBooleanField(term8613, term8613.getClass(), "preserveWhitespace", false);
        setField(term8613, term8613.getClass(), "ancestors", null);
        ArrayList term8610 = new ArrayList();
        ((ArrayList) term8610).add(term8612);
        ((ArrayList) term8610).add(term8613);
        HashMap term8615 = new HashMap();
        Set<Object> term8653 =  ((Map) term8615).keySet();
        HashSet term8614 = new HashSet((Collection<? extends Object>) term8653);
        ArrayList term8616 = new ArrayList();
        ((ArrayList) term8616).add((Object)null);
        ((ArrayList) term8616).add((Object)null);
        ((ArrayList) term8616).add((Object)null);
        ((ArrayList) term8616).add((Object)null);
        ((ArrayList) term8616).add((Object)null);
        LinkedHashMap term8619 = new LinkedHashMap();
        term8606 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8607 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8618 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8607, term8607.getClass(), "tagName", "JDswTTCZHV");
        setBooleanField(term8607, term8607.getClass(), "isBlock", true);
        setBooleanField(term8607, term8607.getClass(), "canContainBlock", true);
        setBooleanField(term8607, term8607.getClass(), "canContainInline", true);
        setBooleanField(term8607, term8607.getClass(), "optionalClosing", true);
        setBooleanField(term8607, term8607.getClass(), "empty", true);
        setBooleanField(term8607, term8607.getClass(), "preserveWhitespace", false);
        setField(term8607, term8607.getClass(), "ancestors", term8610);
        setField(term8606, term8606.getClass(), "tag", term8607);
        setField(term8606, term8606.getClass(), "classNames", term8614);
        setField(term8606, term8606.getClass(), "parentNode", null);
        setField(term8606, term8606.getClass(), "childNodes", term8616);
        setField(term8618, term8618.getClass(), "attributes", term8619);
        setField(term8606, term8606.getClass(), "attributes", term8618);
        setField(term8606, term8606.getClass(), "baseUri", "fhkbdRViHi");
        Object term8560 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8560, term8560.getClass(), "tagName", null);
        setBooleanField(term8560, term8560.getClass(), "isBlock", false);
        setBooleanField(term8560, term8560.getClass(), "canContainBlock", true);
        setBooleanField(term8560, term8560.getClass(), "canContainInline", false);
        setBooleanField(term8560, term8560.getClass(), "optionalClosing", false);
        setBooleanField(term8560, term8560.getClass(), "empty", true);
        setBooleanField(term8560, term8560.getClass(), "preserveWhitespace", false);
        setField(term8560, term8560.getClass(), "ancestors", null);
        Object term8567 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8567, term8567.getClass(), "tagName", null);
        setBooleanField(term8567, term8567.getClass(), "isBlock", false);
        setBooleanField(term8567, term8567.getClass(), "canContainBlock", false);
        setBooleanField(term8567, term8567.getClass(), "canContainInline", false);
        setBooleanField(term8567, term8567.getClass(), "optionalClosing", false);
        setBooleanField(term8567, term8567.getClass(), "empty", false);
        setBooleanField(term8567, term8567.getClass(), "preserveWhitespace", false);
        setField(term8567, term8567.getClass(), "ancestors", null);
        ArrayList term8558 = new ArrayList();
        ((ArrayList) term8558).add(term8560);
        ((ArrayList) term8558).add(term8567);
        term8539 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8539, term8539.getClass(), "tagName", "JDswTTCZHV");
        setBooleanField(term8539, term8539.getClass(), "isBlock", true);
        setBooleanField(term8539, term8539.getClass(), "canContainBlock", true);
        setBooleanField(term8539, term8539.getClass(), "canContainInline", true);
        setBooleanField(term8539, term8539.getClass(), "optionalClosing", true);
        setBooleanField(term8539, term8539.getClass(), "empty", true);
        setBooleanField(term8539, term8539.getClass(), "preserveWhitespace", false);
        setField(term8539, term8539.getClass(), "ancestors", term8558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term443, args);
        assertTrue(recursiveEquals(term443, term8606));
        assertTrue(recursiveEquals(retValue, term8539));
    }

};


