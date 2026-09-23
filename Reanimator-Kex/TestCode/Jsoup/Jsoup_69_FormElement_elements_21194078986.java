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

public class FormElement_elements_21194078986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term603;
     Object term552;

    public FormElement_elements_21194078986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term88 = new ArrayList();
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        term58 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term60 = (Object[]) newArray("java.lang.Object", 0);
        Object term63 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term84 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term85 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term86 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term92 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term94 = (Object[]) newArray("java.lang.String", 0);
        Object[] term95 = (Object[]) newArray("java.lang.String", 0);
        setField(term59, term59.getClass(), "elementData", term60);
        setIntField(term59, term59.getClass(), "size", 0);
        setIntField(term59, term59.getClass(), "modCount", 0);
        setField(term58, term58.getClass(), "elements", term59);
        setField(term63, term63.getClass(), "tagName", "MuLcgQHgqz");
        setBooleanField(term63, term63.getClass(), "isBlock", false);
        setBooleanField(term63, term63.getClass(), "formatAsBlock", true);
        setBooleanField(term63, term63.getClass(), "canContainInline", false);
        setBooleanField(term63, term63.getClass(), "empty", true);
        setBooleanField(term63, term63.getClass(), "selfClosing", false);
        setBooleanField(term63, term63.getClass(), "preserveWhitespace", true);
        setBooleanField(term63, term63.getClass(), "formList", false);
        setBooleanField(term63, term63.getClass(), "formSubmit", false);
        setField(term58, term58.getClass(), "tag", term63);
        setField(term84, term84.getClass(), "referent", null);
        setField(term85, term85.getClass(), "lock", term86);
        setField(term85, term85.getClass(), "head", null);
        setLongField(term85, term85.getClass(), "queueLength", 2442117782898005296L);
        setField(term84, term84.getClass(), "queue", term85);
        setField(term84, term84.getClass(), "next", null);
        setField(term84, term84.getClass(), "discovered", null);
        setField(term58, term58.getClass(), "shadowChildrenRef", term84);
        setField(term58, term58.getClass(), "childNodes", term88);
        setIntField(term92, term92.getClass(), "size", 1162663216);
        setField(term92, term92.getClass(), "keys", term94);
        setField(term92, term92.getClass(), "vals", term95);
        setField(term58, term58.getClass(), "attributes", term92);
        setField(term58, term58.getClass(), "baseUri", "xxtlPwDYFs");
        setField(term58, term58.getClass(), "parentNode", null);
        setIntField(term58, term58.getClass(), "siblingIndex", 1484323161);
        ArrayList term612 = new ArrayList();
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        term603 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term604 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term605 = (Object[]) newArray("java.lang.Object", 0);
        Object term606 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term609 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term610 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term611 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term614 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term615 = (Object[]) newArray("java.lang.String", 0);
        Object[] term616 = (Object[]) newArray("java.lang.String", 0);
        setField(term604, term604.getClass(), "elementData", term605);
        setIntField(term604, term604.getClass(), "size", 0);
        setIntField(term604, term604.getClass(), "modCount", 0);
        setField(term603, term603.getClass(), "elements", term604);
        setField(term606, term606.getClass(), "tagName", "MuLcgQHgqz");
        setBooleanField(term606, term606.getClass(), "isBlock", false);
        setBooleanField(term606, term606.getClass(), "formatAsBlock", true);
        setBooleanField(term606, term606.getClass(), "canContainInline", false);
        setBooleanField(term606, term606.getClass(), "empty", true);
        setBooleanField(term606, term606.getClass(), "selfClosing", false);
        setBooleanField(term606, term606.getClass(), "preserveWhitespace", true);
        setBooleanField(term606, term606.getClass(), "formList", false);
        setBooleanField(term606, term606.getClass(), "formSubmit", false);
        setField(term603, term603.getClass(), "tag", term606);
        setField(term609, term609.getClass(), "referent", null);
        setField(term610, term610.getClass(), "lock", term611);
        setField(term610, term610.getClass(), "head", null);
        setLongField(term610, term610.getClass(), "queueLength", 2442117782898005296L);
        setField(term609, term609.getClass(), "queue", term610);
        setField(term609, term609.getClass(), "next", null);
        setField(term609, term609.getClass(), "discovered", null);
        setField(term603, term603.getClass(), "shadowChildrenRef", term609);
        setField(term603, term603.getClass(), "childNodes", term612);
        setIntField(term614, term614.getClass(), "size", 1162663216);
        setField(term614, term614.getClass(), "keys", term615);
        setField(term614, term614.getClass(), "vals", term616);
        setField(term603, term603.getClass(), "attributes", term614);
        setField(term603, term603.getClass(), "baseUri", "xxtlPwDYFs");
        setField(term603, term603.getClass(), "parentNode", null);
        setIntField(term603, term603.getClass(), "siblingIndex", 1484323161);
        term552 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term553 = (Object[]) newArray("java.lang.Object", 0);
        setField(term552, term552.getClass(), "elementData", term553);
        setIntField(term552, term552.getClass(), "size", 0);
        setIntField(term552, term552.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elements", argTypes, term58, args);
        assertTrue(recursiveEquals(term58, term603));
        assertTrue(recursiveEquals(retValue, term552));
    }

};


