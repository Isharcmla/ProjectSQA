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

public class FormElement_init_3636430786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term46;
     Object term709;
     Object term723;
     Object term730;

    public FormElement_init_3636430786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1, term1.getClass(), "tagName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "normalName", "sjlJAEtRrb");
        setBooleanField(term1, term1.getClass(), "isBlock", false);
        setBooleanField(term1, term1.getClass(), "formatAsBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainInline", false);
        setBooleanField(term1, term1.getClass(), "empty", false);
        setBooleanField(term1, term1.getClass(), "selfClosing", true);
        setBooleanField(term1, term1.getClass(), "preserveWhitespace", true);
        setBooleanField(term1, term1.getClass(), "formList", true);
        setBooleanField(term1, term1.getClass(), "formSubmit", true);
        term46 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term48 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term46, term46.getClass(), "size", 568599855);
        setField(term46, term46.getClass(), "keys", term48);
        setField(term46, term46.getClass(), "vals", term49);
        term709 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term710 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term711 = (Object[]) newArray("java.lang.Object", 0);
        Object term712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term717 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term718 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term719 = (Object[]) newArray("java.lang.String", 0);
        Object[] term720 = (Object[]) newArray("java.lang.String", 0);
        setField(term710, term710.getClass(), "elementData", term711);
        setIntField(term710, term710.getClass(), "size", 0);
        setIntField(term710, term710.getClass(), "modCount", 0);
        setField(term709, term709.getClass(), "elements", term710);
        setField(term712, term712.getClass(), "tagName", "PAEBtnZtTD");
        setField(term712, term712.getClass(), "normalName", "sjlJAEtRrb");
        setBooleanField(term712, term712.getClass(), "isBlock", false);
        setBooleanField(term712, term712.getClass(), "formatAsBlock", false);
        setBooleanField(term712, term712.getClass(), "canContainInline", false);
        setBooleanField(term712, term712.getClass(), "empty", false);
        setBooleanField(term712, term712.getClass(), "selfClosing", true);
        setBooleanField(term712, term712.getClass(), "preserveWhitespace", true);
        setBooleanField(term712, term712.getClass(), "formList", true);
        setBooleanField(term712, term712.getClass(), "formSubmit", true);
        setField(term709, term709.getClass(), "tag", term712);
        setField(term709, term709.getClass(), "shadowChildrenRef", null);
        setIntField(term717, term717.getClass(), "modCount", 0);
        setField(term709, term709.getClass(), "childNodes", term717);
        setIntField(term718, term718.getClass(), "size", 568599855);
        setField(term718, term718.getClass(), "keys", term719);
        setField(term718, term718.getClass(), "vals", term720);
        setField(term709, term709.getClass(), "attributes", term718);
        setField(term709, term709.getClass(), "baseUri", "MuLcgQHgqz");
        setField(term709, term709.getClass(), "parentNode", null);
        setIntField(term709, term709.getClass(), "siblingIndex", 0);
        term723 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term723, term723.getClass(), "tagName", "PAEBtnZtTD");
        setField(term723, term723.getClass(), "normalName", "sjlJAEtRrb");
        setBooleanField(term723, term723.getClass(), "isBlock", false);
        setBooleanField(term723, term723.getClass(), "formatAsBlock", false);
        setBooleanField(term723, term723.getClass(), "canContainInline", false);
        setBooleanField(term723, term723.getClass(), "empty", false);
        setBooleanField(term723, term723.getClass(), "selfClosing", true);
        setBooleanField(term723, term723.getClass(), "preserveWhitespace", true);
        setBooleanField(term723, term723.getClass(), "formList", true);
        setBooleanField(term723, term723.getClass(), "formSubmit", true);
        term730 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term731 = (Object[]) newArray("java.lang.String", 0);
        Object[] term732 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term730, term730.getClass(), "size", 568599855);
        setField(term730, term730.getClass(), "keys", term731);
        setField(term730, term730.getClass(), "vals", term732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "MuLcgQHgqz";
        args[2] = term46;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term709));
        assertTrue(recursiveEquals(term1, term723));
        assertTrue(recursiveEquals(term46, term730));
    }

};


