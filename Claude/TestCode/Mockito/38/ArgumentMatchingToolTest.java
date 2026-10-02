import java.util.ArrayList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;
import org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool;

public class ArgumentMatchingToolTest {

    private ArgumentMatchingTool tool;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
    }

    /**
     * Helper matcher implementing ContainsExtraTypeInformation
     * for controlling matches()/describeTo()/typeMatches() behavior.
     */
    private static class ConfigurableMatcher extends BaseMatcher implements ContainsExtraTypeInformation {
        private final boolean matchesResult;
        private final String description;
        private final boolean typeMatchesResult;
        private final boolean throwOnMatches;

        ConfigurableMatcher(boolean matchesResult, String description, boolean typeMatchesResult, boolean throwOnMatches) {
            this.matchesResult = matchesResult;
            this.description = description;
            this.typeMatchesResult = typeMatchesResult;
            this.throwOnMatches = throwOnMatches;
        }

        @Override
        public boolean matches(Object item) {
            if (throwOnMatches) {
                throw new RuntimeException("forced failure in matches()");
            }
            return matchesResult;
        }

        @Override
        public void describeTo(Description descriptionObj) {
            descriptionObj.appendText(description);
        }

        @Override
        public String toStringWithType() {
            return description + " (typed)";
        }

        @Override
        public boolean typeMatches(Object target) {
            return typeMatchesResult;
        }
    }

    /**
     * Simple matcher NOT implementing ContainsExtraTypeInformation.
     */
    private static class SimpleMatcher extends BaseMatcher {
        private final boolean matchesResult;
        private final String description;

        SimpleMatcher(boolean matchesResult, String description) {
            this.matchesResult = matchesResult;
            this.description = description;
        }

        @Override
        public boolean matches(Object item) {
            return matchesResult;
        }

        @Override
        public void describeTo(Description descriptionObj) {
            descriptionObj.appendText(description);
        }
    }

    private static class ArgumentWithToString {
        private final String value;

        ArgumentWithToString(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    // (ก) Normal / typical input: size mismatch returns empty array
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_sizeMismatch_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new SimpleMatcher(true, "anything"));
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // (ข) Edge case: empty lists/arrays
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_emptyLists_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // Matcher not instance of ContainsExtraTypeInformation -> never suspicious
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_matcherNotContainsExtraTypeInfo_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new SimpleMatcher(false, "someDesc"));
        Object[] arguments = new Object[] { new ArgumentWithToString("someDesc") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // safelyMatches returns true -> not suspicious (condition requires !safelyMatches)
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_matchesTrue_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(true, "sameDesc", false, false));
        Object[] arguments = new Object[] { new ArgumentWithToString("sameDesc") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // toStringEquals returns false -> not suspicious
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_toStringNotEqual_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "descA", false, false));
        Object[] arguments = new Object[] { new ArgumentWithToString("descB") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // typeMatches returns true -> not suspicious (condition requires !typeMatches)
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_typeMatchesTrue_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "sameDesc", true, false));
        Object[] arguments = new Object[] { new ArgumentWithToString("sameDesc") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    // All conditions satisfied -> suspicious index returned
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_suspiciousCase_returnsIndex() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "sameDesc", false, false));
        Object[] arguments = new Object[] { new ArgumentWithToString("sameDesc") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(Integer.valueOf(0), result[0]);
    }

    // matcher throws exception in matches() -> caught and treated as not matching, still suspicious
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_matcherThrowsException_treatedAsNotMatching_suspiciousCase() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "sameDesc", false, true));
        Object[] arguments = new Object[] { new ArgumentWithToString("sameDesc") };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(Integer.valueOf(0), result[0]);
    }

    // Multiple matchers with mixed results
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_multipleMatchers_mixedResults() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "sameDesc1", false, false)); // suspicious -> index 0
        matchers.add(new SimpleMatcher(false, "notContains"));                   // not suspicious -> index 1
        matchers.add(new ConfigurableMatcher(true, "sameDesc3", false, false));  // matches true -> not suspicious
        matchers.add(new ConfigurableMatcher(false, "sameDesc4", false, false)); // suspicious -> index 3

        Object[] arguments = new Object[] {
                new ArgumentWithToString("sameDesc1"),
                new ArgumentWithToString("anything"),
                new ArgumentWithToString("sameDesc3"),
                new ArgumentWithToString("sameDesc4")
        };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(Integer.valueOf(0), result[0]);
        Assert.assertEquals(Integer.valueOf(3), result[1]);
    }

    // (ค) Edge case leading to exception: null argument causes NullPointerException
    // when toStringEquals attempts to call null.toString()
    @Test(expected = NullPointerException.class)
    public void testGetSuspiciouslyNotMatchingArgsIndexes_nullArgument_throwsNullPointerException() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, "anyDesc", false, false));
        Object[] arguments = new Object[] { null };

        tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
    }

    @Test
    public void testDefaultConstructor_createsInstanceSuccessfully() {
        ArgumentMatchingTool instance = new ArgumentMatchingTool();
        Assert.assertNotNull(instance);
    }
}
