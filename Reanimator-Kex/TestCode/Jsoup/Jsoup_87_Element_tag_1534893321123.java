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

public class Element_tag_1534893321123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780;
     Object term58031;
     Object term57984;

    public Element_tag_1534893321123() {
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
        setBooleanField(term781, term781.getClass(), "empty", false);
        setBooleanField(term781, term781.getClass(), "selfClosing", false);
        setBooleanField(term781, term781.getClass(), "preserveWhitespace", true);
        setBooleanField(term781, term781.getClass(), "formList", true);
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
        ArrayList term58038 = new ArrayList();
        ((ArrayList) term58038).add((Object)null);
        term58031 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58032 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58035 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58036 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58037 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58040 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58041 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58042 = (Object[]) newArray("java.lang.String", 0);
        setField(term58032, term58032.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term58032, term58032.getClass(), "isBlock", true);
        setBooleanField(term58032, term58032.getClass(), "formatAsBlock", true);
        setBooleanField(term58032, term58032.getClass(), "canContainInline", true);
        setBooleanField(term58032, term58032.getClass(), "empty", false);
        setBooleanField(term58032, term58032.getClass(), "selfClosing", false);
        setBooleanField(term58032, term58032.getClass(), "preserveWhitespace", true);
        setBooleanField(term58032, term58032.getClass(), "formList", true);
        setBooleanField(term58032, term58032.getClass(), "formSubmit", true);
        setField(term58031, term58031.getClass(), "tag", term58032);
        setField(term58035, term58035.getClass(), "referent", null);
        setField(term58036, term58036.getClass(), "lock", term58037);
        setField(term58036, term58036.getClass(), "head", null);
        setLongField(term58036, term58036.getClass(), "queueLength", 6967924379644551255L);
        setField(term58035, term58035.getClass(), "queue", term58036);
        setField(term58035, term58035.getClass(), "next", null);
        setField(term58035, term58035.getClass(), "discovered", null);
        setField(term58031, term58031.getClass(), "shadowChildrenRef", term58035);
        setField(term58031, term58031.getClass(), "childNodes", term58038);
        setIntField(term58040, term58040.getClass(), "size", 1048535127);
        setField(term58040, term58040.getClass(), "keys", term58041);
        setField(term58040, term58040.getClass(), "vals", term58042);
        setField(term58031, term58031.getClass(), "attributes", term58040);
        setField(term58031, term58031.getClass(), "baseUri", "flxyYxBRtu");
        setField(term58031, term58031.getClass(), "parentNode", null);
        setIntField(term58031, term58031.getClass(), "siblingIndex", -655067527);
        term57984 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term57984, term57984.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term57984, term57984.getClass(), "isBlock", true);
        setBooleanField(term57984, term57984.getClass(), "formatAsBlock", true);
        setBooleanField(term57984, term57984.getClass(), "canContainInline", true);
        setBooleanField(term57984, term57984.getClass(), "empty", false);
        setBooleanField(term57984, term57984.getClass(), "selfClosing", false);
        setBooleanField(term57984, term57984.getClass(), "preserveWhitespace", true);
        setBooleanField(term57984, term57984.getClass(), "formList", true);
        setBooleanField(term57984, term57984.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term780, args);
        assertTrue(recursiveEquals(term780, term58031));
        assertTrue(recursiveEquals(retValue, term57984));
    }

};


