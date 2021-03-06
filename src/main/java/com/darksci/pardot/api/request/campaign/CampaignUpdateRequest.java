/**
 * Copyright 2017, 2018 Stephen Powis https://github.com/Crim/pardot-java-client
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.darksci.pardot.api.request.campaign;

import com.darksci.pardot.api.request.BaseRequest;
import com.darksci.pardot.api.response.campaign.Campaign;

/**
 * For Updating existing Campaigns using Pardot's API.
 */
public class CampaignUpdateRequest extends BaseRequest<CampaignCreateRequest> {
    @Override
    public String getApiEndpoint() {
        return "campaign/do/update";
    }

    /**
     * Define the campaign you want to update in pardot.
     * @param campaign The campaign you want to update in pardot.
     * @return CampaignUpdateRequest builder.
     */
    public CampaignUpdateRequest withCampaign(final Campaign campaign) {
        setParam("id", campaign.getId());
        setParam("name", campaign.getName());
        setParam("cost", campaign.getCost());

        // This is an optional paramter.
        setParam("folder_id", campaign.getFolderId());
        return this;
    }
}
