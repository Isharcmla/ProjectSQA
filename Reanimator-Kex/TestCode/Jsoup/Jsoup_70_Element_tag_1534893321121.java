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

public class Element_tag_1534893321121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780;
     Object term57460;
     Object term57413;

    public Element_tag_1534893321121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term806 = new ArrayList();
        ((ArrayList) term806).add((Object)null);
        term780 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term781 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term802 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term803 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term804 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term810 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term812 = (Object[]) newArray("java.lang.String", 0);
        Object[] term813 = (Object[]) newArray("java.lang.String", 0);
        setField(term781, term781.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term781, term781.getClass(), "isBlock", true);
        setBooleanField(term781, term781.getClass(), "formatAsBlock", true);
        setBooleanField(term781, term781.getClass(), "canContainInline", true);
        setBooleanField(term781, term781.getClass(), "empty", true);
        setBooleanField(term781, term781.getClass(), "selfClosing", true);
        setBooleanField(term781, term781.getClass(), "preserveWhitespace", false);
        setBooleanField(term781, term781.getClass(), "formList", false);
        setBooleanField(term781, term781.getClass(), "formSubmit", true);
        setField(term780, term780.getClass(), "tag", term781);
        setField(term802, term802.getClass(), "referent", null);
        setField(term803, term803.getClass(), "lock", term804);
        setField(term803, term803.getClass(), "head", null);
        setLongField(term803, term803.getClass(), "queueLength", 6967924379644551255L);
        setField(term802, term802.getClass(), "queue", term803);
        setField(term802, term802.getClass(), "next", null);
        setField(term802, term802.getClass(), "discovered", null);
        setField(term780, term780.getClass(), "shadowChildrenRef", term802);
        setField(term780, term780.getClass(), "childNodes", term806);
        setIntField(term810, term810.getClass(), "size", 1048535127);
        setField(term810, term810.getClass(), "keys", term812);
        setField(term810, term810.getClass(), "vals", term813);
        setField(term780, term780.getClass(), "attributes", term810);
        setField(term780, term780.getClass(), "baseUri", "flxyYxBRtu");
        setField(term780, term780.getClass(), "parentNode", null);
        setIntField(term780, term780.getClass(), "siblingIndex", -655067527);
        ArrayList term57467 = new ArrayList();
        ((ArrayList) term57467).add((Object)null);
        term57460 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57461 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57464 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57465 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57466 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57469 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57470 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57471 = (Object[]) newArray("java.lang.String", 0);
        setField(term57461, term57461.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term57461, term57461.getClass(), "isBlock", true);
        setBooleanField(term57461, term57461.getClass(), "formatAsBlock", true);
        setBooleanField(term57461, term57461.getClass(), "canContainInline", true);
        setBooleanField(term57461, term57461.getClass(), "empty", true);
        setBooleanField(term57461, term57461.getClass(), "selfClosing", true);
        setBooleanField(term57461, term57461.getClass(), "preserveWhitespace", false);
        setBooleanField(term57461, term57461.getClass(), "formList", false);
        setBooleanField(term57461, term57461.getClass(), "formSubmit", true);
        setField(term57460, term57460.getClass(), "tag", term57461);
        setField(term57464, term57464.getClass(), "referent", null);
        setField(term57465, term57465.getClass(), "lock", term57466);
        setField(term57465, term57465.getClass(), "head", null);
        setLongField(term57465, term57465.getClass(), "queueLength", 6967924379644551255L);
        setField(term57464, term57464.getClass(), "queue", term57465);
        setField(term57464, term57464.getClass(), "next", null);
        setField(term57464, term57464.getClass(), "discovered", null);
        setField(term57460, term57460.getClass(), "shadowChildrenRef", term57464);
        setField(term57460, term57460.getClass(), "childNodes", term57467);
        setIntField(term57469, term57469.getClass(), "size", 1048535127);
        setField(term57469, term57469.getClass(), "keys", term57470);
        setField(term57469, term57469.getClass(), "vals", term57471);
        setField(term57460, term57460.getClass(), "attributes", term57469);
        setField(term57460, term57460.getClass(), "baseUri", "flxyYxBRtu");
        setField(term57460, term57460.getClass(), "parentNode", null);
        setIntField(term57460, term57460.getClass(), "siblingIndex", -655067527);
        term57413 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term57413, term57413.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term57413, term57413.getClass(), "isBlock", true);
        setBooleanField(term57413, term57413.getClass(), "formatAsBlock", true);
        setBooleanField(term57413, term57413.getClass(), "canContainInline", true);
        setBooleanField(term57413, term57413.getClass(), "empty", true);
        setBooleanField(term57413, term57413.getClass(), "selfClosing", true);
        setBooleanField(term57413, term57413.getClass(), "preserveWhitespace", false);
        setBooleanField(term57413, term57413.getClass(), "formList", false);
        setBooleanField(term57413, term57413.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term780, args);
        assertTrue(recursiveEquals(term780, term57460));
        assertTrue(recursiveEquals(retValue, term57413));
    }

};


