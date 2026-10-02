package org.mockito.internal.matchers;

import org.hamcrest.StringDescription;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SameTest {

    @Test
    public void testMatches_sameReference_returnsTrue() {
        Object obj = new Object();
        Same matcher = new Same(obj);

        Assert.assertTrue(matcher.matches(obj));
    }

    @Test
    public void testMatches_differentReferenceSameContent_returnsFalse() {
        String str1 = new String("test");
        String str2 = new String("test");
        Same matcher = new Same(str1);

        Assert.assertFalse(matcher.matches(str2));
    }

    @Test
    public void testMatches_differentObjects_returnsFalse() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Same matcher = new Same(obj1);

        Assert.assertFalse(matcher.matches(obj2));
    }

    @Test
    public void testMatches_bothNull_returnsTrue() {
        Same matcher = new Same(null);

        Assert.assertTrue(matcher.matches(null));
    }

    @Test
    public void testMatches_wantedNotNullActualNull_returnsFalse() {
        Same matcher = new Same(new Object());

        Assert.assertFalse(matcher.matches(null));
    }

    @Test
    public void testMatches_wantedNullActualNotNull_returnsFalse() {
        Same matcher = new Same(null);

        Assert.assertFalse(matcher.matches(new Object()));
    }

    @Test
    public void testMatches_emptyArray_returnsTrueOnlyForSameReference() {
        int[] arr1 = new int[0];
        int[] arr2 = new int[0];
        Same matcher = new Same(arr1);

        Assert.assertTrue(matcher.matches(arr1));
        Assert.assertFalse(matcher.matches(arr2));
    }

    @Test
    public void testDescribeTo_withString_appendsQuotedString() {
        Same matcher = new Same("hello");
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same(\"hello\")", description.toString());
    }

    @Test
    public void testDescribeTo_withEmptyString_appendsEmptyQuotedString() {
        Same matcher = new Same("");
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same(\"\")", description.toString());
    }

    @Test
    public void testDescribeTo_withCharacter_appendsSingleQuotedChar() {
        Same matcher = new Same('x');
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same('x')", description.toString());
    }

    @Test
    public void testDescribeTo_withInteger_appendsNumberWithoutQuotes() {
        Same matcher = new Same(123);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same(123)", description.toString());
    }

    @Test
    public void testDescribeTo_withNegativeInteger_appendsNegativeNumberWithoutQuotes() {
        Same matcher = new Same(-42);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same(-42)", description.toString());
    }

    @Test
    public void testDescribeTo_withCustomObject_appendsToStringWithoutQuotes() {
        Object obj = new Object() {
            @Override
            public String toString() {
                return "custom_object";
            }
        };
        Same matcher = new Same(obj);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);

        Assert.assertEquals("same(custom_object)", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeTo_withNullWanted_throwsNullPointerException() {
        Same matcher = new Same(null);
        StringDescription description = new StringDescription();

        matcher.describeTo(description);
    }

    @Test
    public void testSerialization_preservesState() throws Exception {
        String wanted = "serializableTarget";
        Same original = new Same(wanted);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Same deserialized = (Same) ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized.matches(wanted));
        Assert.assertFalse(deserialized.matches("other"));
    }
}
