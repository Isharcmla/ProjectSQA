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
import java.util.LinkedHashMap;

public class Element_dataset_1324342130102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704;
     Object term9844;
     Object term9796;

    public Element_dataset_1324342130102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term727 = new ArrayList();
        ((ArrayList) term727).add((Object)null);
        ((ArrayList) term727).add((Object)null);
        ((ArrayList) term727).add((Object)null);
        ((ArrayList) term727).add((Object)null);
        ((ArrayList) term727).add((Object)null);
        ((ArrayList) term727).add((Object)null);
        LinkedHashMap term732 = new LinkedHashMap();
        term704 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term705 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term731 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term705, term705.getClass(), "tagName", "GzFkzHGYFt");
        setBooleanField(term705, term705.getClass(), "isBlock", false);
        setBooleanField(term705, term705.getClass(), "formatAsBlock", true);
        setBooleanField(term705, term705.getClass(), "canContainBlock", false);
        setBooleanField(term705, term705.getClass(), "canContainInline", true);
        setBooleanField(term705, term705.getClass(), "empty", false);
        setBooleanField(term705, term705.getClass(), "selfClosing", true);
        setBooleanField(term705, term705.getClass(), "preserveWhitespace", false);
        setBooleanField(term705, term705.getClass(), "formList", false);
        setBooleanField(term705, term705.getClass(), "formSubmit", true);
        setField(term704, term704.getClass(), "tag", term705);
        setField(term704, term704.getClass(), "parentNode", null);
        setField(term704, term704.getClass(), "childNodes", term727);
        setField(term731, term731.getClass(), "attributes", term732);
        setField(term704, term704.getClass(), "attributes", term731);
        setField(term704, term704.getClass(), "baseUri", "jDtqGUpnZN");
        setIntField(term704, term704.getClass(), "siblingIndex", -2038273078);
        ArrayList term9848 = new ArrayList();
        ((ArrayList) term9848).add((Object)null);
        ((ArrayList) term9848).add((Object)null);
        ((ArrayList) term9848).add((Object)null);
        ((ArrayList) term9848).add((Object)null);
        ((ArrayList) term9848).add((Object)null);
        ((ArrayList) term9848).add((Object)null);
        LinkedHashMap term9851 = new LinkedHashMap();
        term9844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9850 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9845, term9845.getClass(), "tagName", "GzFkzHGYFt");
        setBooleanField(term9845, term9845.getClass(), "isBlock", false);
        setBooleanField(term9845, term9845.getClass(), "formatAsBlock", true);
        setBooleanField(term9845, term9845.getClass(), "canContainBlock", false);
        setBooleanField(term9845, term9845.getClass(), "canContainInline", true);
        setBooleanField(term9845, term9845.getClass(), "empty", false);
        setBooleanField(term9845, term9845.getClass(), "selfClosing", true);
        setBooleanField(term9845, term9845.getClass(), "preserveWhitespace", false);
        setBooleanField(term9845, term9845.getClass(), "formList", false);
        setBooleanField(term9845, term9845.getClass(), "formSubmit", true);
        setField(term9844, term9844.getClass(), "tag", term9845);
        setField(term9844, term9844.getClass(), "parentNode", null);
        setField(term9844, term9844.getClass(), "childNodes", term9848);
        setField(term9850, term9850.getClass(), "attributes", term9851);
        setField(term9844, term9844.getClass(), "attributes", term9850);
        setField(term9844, term9844.getClass(), "baseUri", "jDtqGUpnZN");
        setIntField(term9844, term9844.getClass(), "siblingIndex", -2038273078);
        LinkedHashMap term9798 = new LinkedHashMap();
        term9796 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term9797 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9797, term9797.getClass(), "attributes", term9798);
        setField(term9796, term9796.getClass(), "this$0", term9797);
        setField(term9796, term9796.getClass(), "keySet", null);
        setField(term9796, term9796.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term704, args);
        assertTrue(recursiveEquals(term704, term9844));
        assertTrue(recursiveEquals(retValue, term9796));
    }

};


